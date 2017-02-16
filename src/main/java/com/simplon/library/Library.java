package com.simplon.library;


;
import java.util.ArrayList;
//import java.util.List;


public class Library {

    private String name;
    private ArrayList<Book> books= new ArrayList();
    private ArrayList<CD> cds= new ArrayList();
    private ArrayList<DVD> dvds= new ArrayList();
    private int hour;

    public Library(String name, ArrayList<Book> books, ArrayList<CD> cds, ArrayList<DVD> dvds) {
        this.name = name;
        this.books = books;
        this.cds = cds;
        this.dvds = dvds;
    }

    public Library() {
        this.name = "";
        this.books = new ArrayList<Book>();
        this.cds = new ArrayList<CD>();
        this.dvds = new ArrayList<DVD>();
    }


    //public ArrayList<Book> putBooks() {}

    public boolean isOpen(int hour) {
        if ((hour>=1) && (hour<=7)){
            return true;
        }
        return false;
    }

    public ArrayList<Book> putBooks(ArrayList<Book> newBooks) {
        books.addAll(newBooks);
        return books;
    }


    public ArrayList putsCDs(ArrayList<CD> newCDs) {
        cds.addAll(newCDs);
        return cds;
    }

    public ArrayList putsDVDs(ArrayList<DVD> newDVDs) {
    /*  for (DVD dv : newDVDs) {
            if (!(dvds.contains(dv)) && ((dvds.size() + newDVDs.size()) <= 3)) {
                dvds.add(dv);
            }
        }
        return dvds;
    */

        if ((dvds.size() + newDVDs.size()) <= 3) {
            for (DVD dv : newDVDs) {
                if ((!dvds.contains(dv))) {
                    dvds.add(dv);
                }
            }
        }
        return dvds;

    }

}
