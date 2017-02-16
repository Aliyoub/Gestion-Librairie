package com.simplon.library;


import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aliyou on 14/02/17.
 */
public class Cd {
    private String title;
    private int duration;

    Cd(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
