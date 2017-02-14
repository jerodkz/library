package com.simplon.library;

/**
 * Created by jerome on 14/02/17.
 */
public class DVD {
    private String title;
    private int time;
    private MovieType movietype;
    private boolean threeD;

    public DVD(String title, int time, MovieType movietype, boolean threeD) {
        this.title = title;
        this.time = time;
        this.movietype = movietype;
        this.threeD = threeD;
    }
}
