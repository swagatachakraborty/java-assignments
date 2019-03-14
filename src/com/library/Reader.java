package com.library;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reader {
    private Integer readerId;
    private Set<Book> borrowedBooks;

    public Reader() {
        this.readerId = 0;
        this.borrowedBooks = new HashSet<>();
    }

    public Set<Book> getBorrowedBooks() {
        return Collections.unmodifiableSet(this.borrowedBooks);
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void setReaderId(Integer id) {
        this.readerId = id;
    }
}
