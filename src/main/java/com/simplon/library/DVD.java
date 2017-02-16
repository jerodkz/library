package com.simplon.library;

import java.util.Objects;

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
    public DVD(String title) {
        this.title = title;
        this.time = 0;
        this.movietype = MovieType.FUN;
        this.threeD = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return time == dvd.time &&
                threeD == dvd.threeD &&
                Objects.equals(title, dvd.title) &&
                movietype == dvd.movietype;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, time, movietype, threeD);
    }
}
