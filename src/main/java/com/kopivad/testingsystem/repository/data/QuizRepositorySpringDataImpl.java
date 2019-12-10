package com.kopivad.testingsystem.repository.data;

import com.kopivad.testingsystem.model.Quiz;
import com.kopivad.testingsystem.repository.QuizRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface QuizRepositorySpringDataImpl extends QuizRepository, JpaRepository<Quiz, Long> {
    @Override
    List<Quiz> findAll();

    @Override
    default Quiz saveQuiz(Quiz quiz) {
        return save(quiz);
    }

    @Override
    Quiz findQuizById(Long id);

    @Override
    default void updateQuiz(Quiz quiz) {
        save(quiz);
    }

    @Override
    List<Quiz> findAllByAuthorId(Long id);
}