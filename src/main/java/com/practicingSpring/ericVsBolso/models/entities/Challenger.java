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
public class Challenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idChallenger;

    @Column(nullable = false)
    private String nick;

    @JoinColumn
    @OneToOne
    private Result result;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenger that = (Challenger) o;
        return idChallenger.equals(that.idChallenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChallenger);
    }
}
