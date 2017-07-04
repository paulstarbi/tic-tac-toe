package com.tymek;

/**
 * Created by bratek on 04.07.17.
 */
public enum GameSign {
    X_PLAYER("X"),
    O_PLAYER("O"),
    EMPTY_SIGN("#");

    private String sign;

    GameSign(String sign) {
        this.sign = sign;
    }

    public String getSign(){
        return sign;
    }
}
