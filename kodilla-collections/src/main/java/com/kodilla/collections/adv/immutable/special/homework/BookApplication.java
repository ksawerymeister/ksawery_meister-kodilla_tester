package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Bible", "God");
        Book book2 = bookManager.createBook("Title", "Author");
        Book book3 = bookManager.createBook("Tytus", "Romek Atomek");
        Book book4 = bookManager.createBook("Tytus", "Romek Atomek");
        Book book5 = bookManager.createBook("Tytus", "Romek Atomek");

        if (book1 != null && book2 != null && book3 != null && book4 != null && book5 != null)
            System.out.println((book3.equals(book4) && book3.equals(book5)) ? "Adresy są sobie równe" : "Adresy nie są równe");

        for (Book book : bookManager.getBooks())
            System.out.println(book);

    }
}
