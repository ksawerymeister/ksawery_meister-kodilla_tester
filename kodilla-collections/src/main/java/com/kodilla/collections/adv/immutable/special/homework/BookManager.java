package com.kodilla.collections.adv.immutable.special.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private final List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author){
        Book book = new Book (title, author);
        if(isBookDuplicate(book))
            return null;
        books.add(book);
        return book;

    }

    private boolean isBookDuplicate(Book book){
        for (Book element : books)
            if (element.equals(book)) return true;
            return false;
    }

    public List<Book> getBooks() {
        return books;
    }
}
