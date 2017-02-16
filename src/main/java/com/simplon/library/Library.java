package com.simplon.library;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library
{
    private List<Cd> cds = new ArrayList<Cd>();
    private List<Book> books = new ArrayList<Book>();
    private List<Dvd> dvds = new ArrayList<Dvd>();
    private int hour;
    private final int MAX_DVD = 3;
    private  int STOCK_DVD;




    public ArrayList putCDs(List<Cd> cds,int hour){
        this.hour = hour;
        if(this.isOpen(this.hour)) this.cds.addAll(cds);
        return  (ArrayList)this.cds;
    }

    public ArrayList putBooks(List<Book> books,int hour){
        this.hour = hour;
        if(this.isOpen(this.hour)) this.books.addAll(books);
        return  (ArrayList)this.books;
    }

    public ArrayList putDvds(List<Dvd> listdvds,int hour){
        this.hour = hour;
        this.STOCK_DVD = this.STOCK_DVD  + listdvds.size();
        if(this.isOpen(this.hour)){
            if( this.STOCK_DVD >= this.MAX_DVD) return null;

            for(int i=0;i<listdvds.size();i++){
                if(this.dvds.contains(listdvds.get(i))) return null;
                else addDVD(listdvds.get(i));
            }
        return (ArrayList)this.dvds;
        }
        else return null;
    }

   public void addDVD(Dvd dvd) {
       this.dvds.add(dvd);
   }

    boolean isOpen(int hour) {
        this.hour = hour;
        return  (this.hour >= 1 && this.hour <= 7) ;
    }


    public static void main( String[] args )
    {
        Library library = new Library();

        System.out.println(library.isOpen(2));

        Cd cd1 = new Cd("titre cd1", 60);
        Cd cd2 = new Cd("titre cd2", 120);
        List<Cd> cds= Arrays.asList(cd1,cd2);
        library.putCDs(cds,3);
        System.out.println(cds.toString());

        Dvd dvd1 = new Dvd("titre dvd1", 50,Movie.FUN,false);
        Dvd dvd2 = new Dvd("dvd", 120, Movie.HORROR, false);
        List<Dvd> dvds= Arrays.asList(dvd1,dvd2);
        library.putDvds(dvds,4);
        System.out.println(dvds.toString());


        Book book1 = new Book("titre book1", 150);
        Book book2 = new Book("titre book2", 120);
        List<Book> books = Arrays.asList(book1,book2);
        library.putBooks(books,5);
        System.out.println(books.toString());

    }


}
