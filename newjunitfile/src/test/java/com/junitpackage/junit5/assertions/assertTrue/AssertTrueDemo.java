package com.junitpackage.junit5.assertions.assertTrue;

import com.junitpackage.junit5.model.Book;
import com.junitpackage.junit5.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {


    @Test
    public void assertTrueWithNoMessage(){
        BookService bookService= new BookService();

        Book book1= new Book("1","java","ghgjhgjhg");
        bookService.addBook(book1);

        List<Book> bookList = bookService.books();
        assertTrue(bookList.isEmpty());



    }
}
