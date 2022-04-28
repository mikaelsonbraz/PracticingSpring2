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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idUser;

    @Column(nullable = false)
    private String nick;

    @JoinColumn
    @OneToOne
    private Result result;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser) && Objects.equals(nick, user.nick) && Objects.equals(result, user.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, nick, result);
    }
}
