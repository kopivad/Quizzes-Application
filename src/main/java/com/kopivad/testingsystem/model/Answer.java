package com.kopivad.testingsystem.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    private boolean isRight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Question question;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "answer")
    private List<QuizResult> quizResults;

    public Answer() {
    }

    public Answer(String text, boolean isRight, Question question) {
        this.text = text;
        this.isRight = isRight;
        this.question = question;
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void setRight(boolean isRight) {
        this.isRight = isRight;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Answer;
    }

}