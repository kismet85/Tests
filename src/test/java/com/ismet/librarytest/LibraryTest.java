package com.ismet.librarytest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("The Catcher in the Rye");
        List<String> books = library.listBooks();
        assertEquals(1, books.size());
        assertTrue(books.contains("The Catcher in the Rye"));
    }

    @Test
    public void testRemoveBook() {
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertFalse(books.contains("1984"));
    }

    @Test
    public void testListBooks() {
        library.addBook("To Kill a Mockingbird");
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains("To Kill a Mockingbird"));
        assertTrue(books.contains("The Great Gatsby"));
    }

    @Test
    public void testRemoveNonExistentBook() {
        library.addBook("The Hobbit");
        library.removeBook("Not a Book");
        List<String> books = library.listBooks();
        assertEquals(1, books.size());
        assertTrue(books.contains("The Hobbit"));
    }
}
