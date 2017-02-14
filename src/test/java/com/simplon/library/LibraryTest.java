package com.simplon.library;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class LibraryTest {
    @Test
    public void ArrayListPutsBooks_1book() {
        //set
        Library library = new Library();
        //test
        ArrayList<Book> books = library.putBooks();
        //assert
    }
}