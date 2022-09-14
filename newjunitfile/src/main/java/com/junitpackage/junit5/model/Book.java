package com.junitpackage.junit5.model;

public class Book {

    private String bookId;
    private String title;
    private String publisher;


    public Book(String bookId, String title, String publisher) {
        this.bookId = bookId;
        this.title = title;
        this.publisher = publisher;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
