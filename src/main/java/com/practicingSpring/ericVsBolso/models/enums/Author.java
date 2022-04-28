package com.practicingSpring.ericVsBolso.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Author {

    CARTMAN(0, "Eric Cartman"),
    BOLSONARO(1, "Jair Bolsonaro");

    private final Integer code;
    private final String name;

    public static Author toEnum(Integer code){
        if (code == null){
            return null;
        }

        for (Author x : Author.values()){
            if (code.equals(x.getCode())){
                return x;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
