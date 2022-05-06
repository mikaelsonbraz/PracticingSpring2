package com.practicingSpring.ericVsBolso.models.entities;

import com.practicingSpring.ericVsBolso.models.enums.Author;
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

    @Column(nullable = false)
    private Author author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return idQuestion.equals(question.idQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion);
    }
}
