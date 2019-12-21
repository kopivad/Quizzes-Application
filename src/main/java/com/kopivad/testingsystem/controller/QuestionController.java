package com.kopivad.testingsystem.controller;

import com.kopivad.testingsystem.form.QuestionForm;
import com.kopivad.testingsystem.model.Question;
import com.kopivad.testingsystem.model.Quiz;
import com.kopivad.testingsystem.service.QuestionService;
import com.kopivad.testingsystem.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class QuestionController {
    private final QuestionService questionService;
    private final QuizService quizService;


    @PostMapping(path = "/question/add")
    public String saveQuestion(QuestionForm form) {
        Quiz quiz = quizService.getQuizById(form.getQuizId());
        Question newQuestion = new Question();
        newQuestion.setId(-1L);
        newQuestion.setTitle(form.getTitle());
        newQuestion.setQuiz(quiz);
        questionService.saveQuestion(newQuestion);
        return "redirect:/question/manage";
    }

    @PostMapping(path = "question/edit")
    public String editQuiz(@ModelAttribute QuestionForm questionForm) {
        Question questionForUpdate = questionService.getQuestionById(questionForm.getQuestionId());
        Quiz currentQuiz = quizService.getQuizById(questionForm.getQuizId());
        questionForUpdate.setTitle(questionForm.getTitle());
        questionForUpdate.setQuiz(currentQuiz);
        questionService.updateQuestion(questionForUpdate);
        return "redirect:/question/manage";
    }

    @GetMapping(path = "quiz/{quizId}/question/{n}")
    public String getQuestionByIdAndQuizId(@PathVariable(name = "quizId") Long quizId,
                                           @PathVariable(name = "n") Integer n,
                                           @ModelAttribute(name = "session") Long sessionId,
                                           Model model
    ) {
        model.addAttribute("quizId", quizId);
        Pageable pageable = PageRequest.of(n - 1, 1);
        Quiz currentQuiz = quizService.getQuizById(quizId);
        Page<Question> question = questionService.getQuestionByQuizId(quizId, pageable);

        Question currentQuestion = question.getContent().get(0);

        model.addAttribute("quiz", currentQuiz);
        model.addAttribute("question", currentQuestion);
        model.addAttribute("questionNumber", question.getNumber());
        model.addAttribute("questionTotalPages", question.getTotalPages());
        model.addAttribute("answers", currentQuestion.getAnswers());
        model.addAttribute("sessionId", sessionId);
        return "question";
    }


    @GetMapping(path = "question/add")
    public String getAddQuestionPage(Model model) {
        List<Quiz> allQuizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", allQuizzes);
        return "questionAdd";
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(path = "/question/manage/{id}")
    public String getAllQuestionsManageByQuizIdPage(@PathVariable(name = "id") Long id,  Model model) {
        List<Question> allQuestions = questionService.getQuestionByQuizId(id);
        model.addAttribute("questions", allQuestions);
        return "questionManage";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(path = "/question/manage")
    public String getQuestionManagePage(Model model) {
        List<Question> allQuestions = questionService.getAllQuestions();
        model.addAttribute("questions", allQuestions);
        return "questionManage";
    }

    @GetMapping(path = "/question/edit/{id}")
    public String getEditQuestionPage(@PathVariable(name = "id") Long id, Model model, QuestionForm questionForm) {
        Question currentQuestion = questionService.getQuestionById(id);
        List<Quiz> allQuizzes = quizService.getAllQuizzes();
        model.addAttribute("question", currentQuestion);
        model.addAttribute("quizzes", allQuizzes);
        model.addAttribute("questionForm", questionForm);
        return "questionEdit";
    }

}
