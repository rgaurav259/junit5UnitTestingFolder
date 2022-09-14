package com.junitpackage.junit5.assertions.assertEquals;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertEqualDemo {
    @Test
    public void assertEqualsWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("4");
        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First java",actualBook.getTitle());
        assertEquals("wrox",actualBook.getPublisher());

    }


    @Test
    public void assertEqualsWithMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("1");
        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First java",actualBook.getTitle());
        assertEquals("wrox",actualBook.getPublisher());


    }


    @Test
    public void assertEqualsWithMessageSupplier() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("1");
        assertEquals("1",actualBook.getBookId());
        assertEquals("Head First java",actualBook.getTitle());
        assertEquals("wrox",actualBook.getPublisher());


    }

}
