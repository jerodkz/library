package com.simplon.library;

import org.junit.Test;


import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class LibraryTest {

        @Test
        public void isOpen_hour(){
            //set
            ArrayList<Book> books = new ArrayList<Book>();
            ArrayList<CD> cds = new ArrayList<CD>();
            ArrayList<DVD> dvds = new ArrayList<DVD>();
            Library library = new Library("list",books,cds,dvds);
            //test
            boolean result = library.isOpen(1);
            //assert
            //assertEquals(true, result);
            assertTrue(result);
        }


    /*@Test
    public void putsBooks_book() {
        //set
        ArrayList<Book> books = new ArrayList<Book>();


        ArrayList<Book> newBooks = new ArrayList<Book>();
        Book book1 = new Book("livre1",36);
        Book book2 = new Book("livre2",24);
        newBooks.add(book1);
        newBooks.add(book2);
        ArrayList<CD> cds = new ArrayList<CD>();
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        Library library = new Library("list",books,cds,dvds);

        //test
        ArrayList result = library.putBooks(newBooks);
        //assert
        assertEquals(newBooks,result);
    }*/

    @Test
    public void putsBooks_book() {
        //set
        Library library = new Library();
        ArrayList<Book> newBooks = new ArrayList<Book>();
        Book book1 = new Book("livre1",36);
        Book book2 = new Book("livre2",24);
        newBooks.add(book1);
        newBooks.add(book2);
        //test
        ArrayList result = library.putBooks(newBooks);
        //assert
        assertEquals(newBooks,result);
    }

    @Test
    public void putsCDs_cd(){
        //set
        Library library = new Library();
        ArrayList<CD> newCDs = new ArrayList<CD>();
        CD cd1 = new CD("cd1",120);
        CD cd2 = new CD("cd2",60);
        newCDs.add(cd1);
        newCDs.add(cd2);
        //test
        ArrayList result = library.putsCDs(newCDs);
        //assert
        assertEquals(newCDs,result);
    }

    @Test
    public void putsDVDs_3(){
        //set
        Library library = new Library();
        ArrayList<DVD> newDVDs = new ArrayList<DVD>();
        DVD dvd1 = new DVD("dvd1");
        DVD dvd2 = new DVD("dvd2");
        DVD dvd3 = new DVD("dvd3");
        newDVDs.add(dvd1);
        newDVDs.add(dvd2);
        newDVDs.add(dvd3);
        //test
        ArrayList result = library.putsDVDs(newDVDs);
        //assert
        assertEquals(newDVDs.size(),result.size());
    }

    @Test
    public void putsDVDs_3plus(){
        //set
        Library library = new Library();
        ArrayList<DVD> newDVDs = new ArrayList<DVD>();
        DVD dvd1 = new DVD("dvd1");
        DVD dvd2 = new DVD("dvd2");
        DVD dvd3 = new DVD("dvd3");
        DVD dvd4 = new DVD("dvd4");
        newDVDs.add(dvd1);
        newDVDs.add(dvd2);
        newDVDs.add(dvd3);
        newDVDs.add(dvd4);
        //test
        ArrayList result = library.putsDVDs(newDVDs);
        //assert
        assertEquals(0,result.size());
    }

    @Test
    public void putsDVDs_nodouble(){
        //set
        Library library = new Library();
        ArrayList<DVD> newDVDs = new ArrayList<DVD>();
        DVD dvd1 = new DVD("dvd1");
        DVD dvd2 = new DVD("dvd2");
        DVD dvd3 = new DVD("dvd3");
        newDVDs.add(dvd1);
        newDVDs.add(dvd2);
        newDVDs.add(dvd3);
        //test
        ArrayList result = library.putsDVDs(newDVDs);
        //assert
        assertEquals(newDVDs.size(),result.size());
    }


    @Test
    public void putsDVDs_ifdouble(){
        //set
        Library library = new Library();
        ArrayList<DVD> newDVDs = new ArrayList<DVD>();
        DVD dvd1 = new DVD("dvd1");
        DVD dvd2 = new DVD("dvd2");
        DVD dvd3 = new DVD("dvd2");
        //DVD dvd3 = dvd2;
        newDVDs.add(dvd1);
        newDVDs.add(dvd2);
        newDVDs.add(dvd3);
        //test
        ArrayList result = library.putsDVDs(newDVDs);
        //assert
        assertEquals(2,result.size());
    }

}