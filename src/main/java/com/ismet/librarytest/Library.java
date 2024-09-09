package com.ismet.librarytest;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public List<String> listBooks() {
        return new ArrayList<>(books);
    }
}
