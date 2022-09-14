package com.junitpackage.junit5.assertions.assertFalse;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertFalseDemo {




    //if we comments the added book then all test cases passed

    @Test
    public void assertFalseWithNoMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertFalse(bookList.isEmpty());



    }

    @Test
    public void assertFalseWithMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        //bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertFalse(bookList.isEmpty(),"list of book is  empty");



    }



    @Test
    public void assertFalseWithMessageSupplier(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertFalse(bookList.isEmpty(),()-> "list of book is not empty");



    }



    @Test
    public void assertFalseWithBooleanSupplierAndNoMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertFalse(()-> bookList.isEmpty());



    }

    @Test
    public void assertFalseWithBooleanSupplierAndMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertFalse(()-> bookList.isEmpty(),"list of book is not empty");

    }


}

