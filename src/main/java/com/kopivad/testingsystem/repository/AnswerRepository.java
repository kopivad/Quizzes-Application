package com.kopivad.testingsystem.repository;

import com.kopivad.testingsystem.model.Answer;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface AnswerRepository {
    List<Answer> findAllByQuestionId(Long id);
    List<Answer> findAll();
    Answer saveAnswer(Answer answer);
    Answer findAnswerById(Long id);
    void updateAnswer(Answer answer);

}
