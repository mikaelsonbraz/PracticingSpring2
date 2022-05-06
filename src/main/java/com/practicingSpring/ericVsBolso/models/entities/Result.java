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
    @ToString.Exclude
    private List<Question> questionList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return idResult.equals(result.idResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResult);
    }
}
