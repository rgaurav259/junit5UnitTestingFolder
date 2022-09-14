package com.junitpackage.junit5.assertions.assertNotNull;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNotNullDemo {

    @Test
    public void assertNotNullWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("4");
        assertNotNull(actualBook);
    }


    @Test
    public void assertNotNullWithMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("1");
        assertNotNull(actualBook, "Book is not null");


    }


    @Test
    public void assertNotNullWithMessageSupplier() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("1");
        assertNotNull(actualBook, () -> "Book is not null");


    }
}

