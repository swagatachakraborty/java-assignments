package com.library;
import java.util.*;

public class Library {
    private Map<Book, Integer> booksAvailable;
    private HashSet<Reader> readers;
    private Map<Book, HashSet<Reader>> bookRegister;
    private Map<Reader, HashSet<Book>> readerRegister;
    private HashSet<Book> removedBooks;
    private Librarian librarian;
    private Integer latestMemberId;

    public Library() {
        this.bookRegister = new HashMap<>();
        this.readerRegister = new HashMap<>();
        this.readers = new HashSet<>();
        this.removedBooks = new HashSet<>();
        this.librarian = new Librarian();
        this.booksAvailable = new HashMap<>();
        this.latestMemberId = 1;
    }

    public Library(Set<Book> books) {
        this();
        for (Book book : books) {
            this.booksAvailable.put(book, 1);
            this.bookRegister.put(book, new HashSet<>());
        }
    }

    public Library(Set<Book> books, HashSet<Reader> readers) {
        this(books);
        this.readers = readers;
    }

    public boolean registerMember(Reader reader) {
        if(this.readers.contains(reader)){
            return false;
        }

        this.readers.add(reader);
        reader.setReaderId(this.latestMemberId);
        this.latestMemberId++;
        readerRegister.put(reader, new HashSet<>());
        return true;
    }

    public Set<Reader> getReaders() {
        return Collections.unmodifiableSet(readers);
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    private Book getBookByName(String book) {
        for (Book bookInLibrary : this.booksAvailable.keySet()) {
            if(bookInLibrary.getName().equals(book)){
                return bookInLibrary;
            }
        }
        return null;
    }

    public boolean isAvailable(String book) {
        Book searchedBook = this.getBookByName(book);
        return searchedBook != null && this.booksAvailable.get(searchedBook) > 0;
    }

    private boolean isRegistered(Reader reader) {
        return this.readers.contains(reader);
    }

    class Librarian {
        public int addBookToLibrary(Book book) {
            booksAvailable.putIfAbsent(book, 0);
            Integer availability = booksAvailable.get(book);
            booksAvailable.put(book, availability + 1);
            bookRegister.put(book, new HashSet<>());
            return availability + 1;
        }

        public boolean lendBook(String bookName, Reader reader) {
            if(!isRegistered(reader) || !isAvailable(bookName)) {
                return false;
            }

            Book book = getBookByName(bookName);
            Integer availability = booksAvailable.get(book);
            booksAvailable.put(book, availability - 1);

            bookRegister.get(book).add(reader);
            readerRegister.get(reader).add(book);
            reader.addBook(book);
            return true;
        }

        public Set<Reader> getReadersBy(Book book) {
            return bookRegister.get(book);
        }

        public Set<Book> getBorrowedBooksBy(Reader reader) {
           return readerRegister.get(reader);
        }

        public boolean removeBook(Book book) {
            if(!booksAvailable.containsKey(book)) {
                return false;
            }

            booksAvailable.remove(book);
            bookRegister.remove(book);
            removedBooks.add(book);
            return true;
        }

        public boolean wasRemoved(Book book) {
            return removedBooks.contains(book);
        }

        public boolean reassignReturnedBook(Book book, Reader reader) {
            if(!booksAvailable.containsKey(book) || !reader.getBorrowedBooks().contains(book)) {
                return false;
            }

            bookRegister.get(book).remove(reader);
            readerRegister.get(reader).remove(book);
            this.addBookToLibrary(book);
            return true;
        }
    }
}
