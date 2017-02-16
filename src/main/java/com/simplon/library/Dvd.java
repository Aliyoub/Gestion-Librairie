package com.simplon.library;

import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aliyou on 14/02/17.
 */

public class Dvd {
    private String title;
    private int duration;
    private boolean is3D;
    private Movie kind;

    Dvd(String title, int duration, Movie kind, boolean is3D){
        this.title = title;
        this.duration = duration;
        this.kind = kind;
        this.is3D = is3D;

    }

    @Override
    public String toString() {
        return //"Dvd{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", is3D=" + is3D +
                ", kind=" + kind ;
                //'}';
    }
}

