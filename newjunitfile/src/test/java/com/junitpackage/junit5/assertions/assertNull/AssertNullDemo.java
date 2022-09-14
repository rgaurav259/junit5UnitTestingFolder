package com.junitpackage.junit5.assertions.assertNull;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullDemo {

    @Test
    public void assertNullWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First java", "wrox");
        Book headFirstDesignPatternBook = new Book("2", "Head First design pattern", "packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook = bookService.getBooksById("4");
        assertNull(actualBook);
    }




        @Test
        public void assertNullWithMessage(){

            BookService bookService = new BookService();

            Book headFirstJavaBook = new Book("1","Head First java","wrox");
            Book headFirstDesignPatternBook = new Book("2","Head First design pattern","packt");

            bookService.addBook(headFirstJavaBook);
            bookService.addBook(headFirstDesignPatternBook);

            Book actualBook= bookService.getBooksById("1");
            assertNull(actualBook,"Book is not null");


    }



    @Test
    public void assertNullWithMessageSupplier(){

        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1","Head First java","wrox");
        Book headFirstDesignPatternBook = new Book("2","Head First design pattern","packt");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignPatternBook);

        Book actualBook= bookService.getBooksById("1");
        assertNull(actualBook,() -> "Book is not null");


    }
}
