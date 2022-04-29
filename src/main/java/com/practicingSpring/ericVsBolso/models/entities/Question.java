package com.practicingSpring.ericVsBolso.models.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idQuestion;

    @Column(nullable = false)
    private String questionText;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(idQuestion, question.idQuestion) && Objects.equals(questionText, question.questionText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, questionText);
    }
}
