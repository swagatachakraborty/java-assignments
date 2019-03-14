package com.library;
/* library
    Has got a lot of books (This could be a lot (millions of) books) ->DONE
    Has got a readers who read books in the library ->DONE

    As a reader I should be able to search a book in the library by its name ->DONE
    As a reader I should be able to borrow a book from library ->DONE
    As a reader I should be able to check if I have a book already borrowed
    As a reader I should be able to return a borrowed books ->DONE

    As a librarian I should be able add a new book into library ->DONE
    As a librarian I should be able to check who has borrowed a specific book ->DONE
    As a librarian I should be able to check books borrowed by a reader ->DONE
    As a librarian I should be able to remove a book from library ->DONE
    As a librarian I should be able to search if a book was removed in the past, so it can be bought again if necessary ->DONE
*/

import java.util.*;

public class Library {
    private Map<Book, Integer> booksAvailable;
    private HashSet<Reader> readers;
    private Map<Book, HashSet<Reader>> register;
    private HashSet<Book> removedBooks;
    private Librarian librarian;
    private Integer latestMemberId;

    public Library() {
        this.register = new HashMap<>();
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
            this.register.put(book, new HashSet<>());
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

    private boolean isRegister(Reader reader) {
        return this.readers.contains(reader);
    }

    class Librarian {
        public int addBookToLibrary(Book book) {
            booksAvailable.putIfAbsent(book, 0);
            Integer availability = booksAvailable.get(book);
            booksAvailable.put(book, availability + 1);
            register.put(book, new HashSet<>());
            return availability + 1;
        }

        public boolean lendBook(String bookName, Reader reader) {
            if(!isRegister(reader) || !isAvailable(bookName)) {
                return false;
            }

            Book book = getBookByName(bookName);
            Integer availability = booksAvailable.get(book);
            booksAvailable.put(book, availability - 1);

            HashSet<Reader> readersForBook = register.get(book);
            readersForBook.add(reader);
            reader.addBook(book);
            return true;
        }

        public Set<Reader> getReadersBy(Book book) {
            return register.get(book);
        }

        public Set<Book> getBorrowedBooksBy(Reader reader) {
            Set<Book> booksOfReader = new HashSet<>();

            for (Book book : register.keySet()) {
                if(register.get(book).contains(reader)) {
                    booksOfReader.add(book);
                }
            }
            return booksOfReader;
        }

        public boolean removeBook(Book book) {
            if(!booksAvailable.containsKey(book)) {
                return false;
            }

            booksAvailable.remove(book);
            register.remove(book);
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

            HashSet<Reader> readerOfBook = register.get(book);
            readerOfBook.remove(reader);
            this.addBookToLibrary(book);
            return true;
        }
    }
}
