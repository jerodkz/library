package com.simplon.library;

/**
 * Created by jerome on 14/02/17.
 */
public enum MovieType {
    HORROR("horror"),FUN("fun"),ACTION("action"),MUSICAL("");

    private String kind;

    MovieType(String movie) {
        this.kind = movie;
    }
}
