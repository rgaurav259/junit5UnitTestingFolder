package com.junitpackage.junit5.assertions.assertTrue;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueMessage {

    @Test
    public void assertTrueWithNoMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertTrue(bookList.isEmpty());



    }

        @Test
        public void assertTrueWithMessage(){
            BookService bookService= new BookService();

            Book book1= new Book("1","java","ghgjhgjhg");
            bookService.addBook(book1);

            List<Book> bookList = bookService.books();
            assertTrue(bookList.isEmpty(),"list of book is not empty");



        }



    @Test
    public void assertTrueWithMessageSupplier(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertTrue(bookList.isEmpty(),()-> "list of book is not empty");



    }



    @Test
    public void assertTrueWithBooleanSupplierAndNoMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertTrue(()-> bookList.isEmpty());



    }

    @Test
    public void assertTrueWithBooleanSupplierAndMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertTrue(()-> bookList.isEmpty(),"list of book is not empty");

    }
}
