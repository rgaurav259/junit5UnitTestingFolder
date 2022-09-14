package com.junitpackage.junit5.service;

import com.junitpackage.junit5.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    private List<Book> listOfBooks=new ArrayList<>();

    public void addBook(Book book){
        listOfBooks.add(book);
    }

    public List<Book> books(){
        return Collections.unmodifiableList(listOfBooks);
    }

    public Book getBooksById(String bookId){
        for (Book book: listOfBooks){
            if (bookId.equals(book.getBookId())){
                return book;
            }
        }
        return null;

    }
}
