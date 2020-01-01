package com.kopivad.testingsystem.service.impl;

import com.kopivad.testingsystem.model.Quiz;
import com.kopivad.testingsystem.model.QuizSession;
import com.kopivad.testingsystem.model.User;
import com.kopivad.testingsystem.repository.QuizSessionRepository;
import com.kopivad.testingsystem.service.QuizSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizSessionServiceImpl implements QuizSessionService {
    private final QuizSessionRepository sessionRepository;

    @Override
    public QuizSession saveQuizSession(QuizSession quizSession) {
        return sessionRepository.saveQuizSession(quizSession);
    }

    @Override
    public QuizSession getQuizSessionById(Long sessionId) {
        return sessionRepository.findQuizSessionById(sessionId);
    }

    @Override
    public QuizSession createSession(Quiz quiz, User user) {
        return saveQuizSession(
                QuizSession
                .builder()
                .user(user)
                .quiz(quiz)
                .build());
    }
}