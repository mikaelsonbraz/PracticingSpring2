package com.practicingSpring.ericVsBolso.models.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idResult;

    @Column
    private Integer score;

    @JoinColumn
    @OneToOne
    private Challenger challenger;

    @OneToMany
    private List<Question> questionList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(idResult, result.idResult) && Objects.equals(score, result.score) && Objects.equals(challenger, result.challenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResult, score, challenger);
    }
}
