package com.simplon.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliyou on 14/02/17.
 */



public class Book {

    private String title;
    private int nbpage;

    Book(String title, int nbpage){
        this.title = title;
        this.nbpage = nbpage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", nbpage=" + nbpage +
                '}';
    }
}
