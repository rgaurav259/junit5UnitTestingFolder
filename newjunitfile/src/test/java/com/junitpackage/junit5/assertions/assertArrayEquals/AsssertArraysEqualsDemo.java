package com.junitpackage.junit5.assertions.assertArrayEquals;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsssertArraysEqualsDemo {


    @Test
    public void assertArraysEqualsWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");
        Book headFirstJavaScriptBook = new Book("3", "Head First java script", "wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavaScriptBook);

       String[] actualBookIds = bookService.getBookIdsByPublisher("wrox");
       assertArrayEquals(new String[] {"1","3"},actualBookIds);

    }


    @Test
    public void assertArraysEqualsWithMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");
        Book headFirstJavaScriptBook = new Book("3", "Head First java script", "wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavaScriptBook);

        String[] actualBookIds = bookService.getBookIdsByPublisher("wrox");
        assertArrayEquals(new String[] {"3","3"},actualBookIds,"bookIds did not match");

    }


    @Test
    public void assertArraysEqualsWithMessageSupplier() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");
        Book headFirstJavaScriptBook = new Book("3", "Head First java script", "wrox");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);
        bookService.addBook(headFirstJavaScriptBook);

        String[] actualBookIds = bookService.getBookIdsByPublisher("wrox");
        assertArrayEquals(new String[] {"1","3"},actualBookIds,()->"bookIds did not match");

    }



}
