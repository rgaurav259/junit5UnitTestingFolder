package com.junitpackage.junit5.assertions.assertNotEquals;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AssertNotEqualsDemo {

    @Test
    public void assertNotEqualsWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("2");
        assertNotEquals("1",actualBook.getBookId());
        assertNotEquals("Head First java",actualBook.getTitle());
        assertNotEquals("wrox",actualBook.getPublisher());

    }


    @Test
    public void assertNotEqualsWithMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("1");
        assertNotEquals("1",actualBook.getBookId(),"bookId matches to expected value");



    }


    @Test
    public void assertNotEqualsWithMessageSupplier() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("2");
        assertNotEquals("1",actualBook.getBookId(),()->"bookId matches to expected value");



    }


}
