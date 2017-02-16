package com.simplon.library;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LibraryTest{

    @Test
    public void putCDsTest() {
        Library library = new Library();

        Cd cd1 = new Cd("titre cd1", 60);
        Cd cd2 = new Cd("titre cd2", 120);

        List<Cd> cds= Arrays.asList(cd1,cd2);
        ArrayList<Cd> result = library.putCDs(cds,4);
        assertEquals(result,cds);
    }

    @Test
    public void putDvdsTest() {
        Library library = new Library();

        Dvd dvd1 = new Dvd("titre dvd1", 50,Movie.FUN,false);
        Dvd dvd2 = new Dvd("dvd", 120, Movie.HORROR, false);

        List<Dvd> dvds= Arrays.asList(dvd1,dvd2);
        ArrayList<Cd> result = library.putDvds(dvds,4);
        assertEquals(result,dvds);
    }

    @Test
    public void putDvdsTestForMoreThan3DVD() {
        Library library = new Library();

        Dvd dvd1 = new Dvd("titre dvd1", 30,Movie.FUN,false);
        Dvd dvd2 = new Dvd("titre dvd2", 70,Movie.HORROR,true);
        Dvd dvd3 = new Dvd("titre dvd3", 90,Movie.MUSICAL,false);
        Dvd dvd4 = new Dvd("titre dvd4", 80,Movie.ACTION,true);

        List<Dvd> dvds= Arrays.asList(dvd1,dvd2,dvd3,dvd4);
        ArrayList<Dvd> result = library.putDvds(dvds,4);
        assertEquals(null,result);
    }

    @Test
    public void putDvdsTestForLibraryClosed() {
        Library library = new Library();

        Dvd dvd3 = new Dvd("titre dvd3", 30,Movie.FUN,false);
        Dvd dvd4 = new Dvd("titre dvd4", 70,Movie.HORROR,true);

        List<Dvd> dvds= Arrays.asList(dvd3,dvd4);
        ArrayList<Dvd> result = library.putDvds(dvds,9);
        assertEquals(null,result);
    }

    @Test
    public void putDvdsTestForDvdAlreadyexists() {
        Library library = new Library();

        Dvd dvd1 = new Dvd("titre dvd1", 30,Movie.FUN,false);
        Dvd dvd2 = new Dvd("titre dvd2", 70,Movie.HORROR,true);

        List<Dvd> dvds= Arrays.asList(dvd1,dvd2);
        library.putDvds(dvds,4);

        Dvd dvd3 = new Dvd("titre dvd1", 30,Movie.FUN,false);

        List<Dvd> dvds2 = Arrays.asList(dvd3);
        ArrayList<Dvd> result = library.putDvds(dvds2,4);

        assertEquals(null,result);
    }

    @Test
    public void putBooksTest() {
        Library library = new Library();

        Book book1 = new Book("titre book1", 150);
        Book book2 = new Book("titre book2", 120);

        List<Book> books = Arrays.asList(book1,book2);
        ArrayList<Book> result = library.putBooks(books,4);
        assertEquals(result,books);
    }

    @Test
    public void isOpenTest() {
        Library library = new Library();

        boolean result = library.isOpen(2);
        boolean result1 = library.isOpen(9);

        assertTrue(result);
        assertFalse(result1);
    }

}
