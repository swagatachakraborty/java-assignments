package com.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;
    private Library.Librarian librarian;
    private Book sandMan, elevenMinutes, fiveLittlePics;
    private Reader  reader1;


    @BeforeEach
    void setUp() {
        sandMan = new Book("Sand Man");
        elevenMinutes = new Book("Eleven Minutes");
        fiveLittlePics = new Book("Five Little Pics");

        Set<Book> books = new HashSet<>();
        books.add(sandMan);
        books.add(elevenMinutes);
        books.add(fiveLittlePics);
        library = new Library(books);

        librarian = library.getLibrarian();
        reader1 = new Reader();
        library.registerMember(reader1);
    }

    @Test
    void isAvailable_ShouldReturnTrueIfTheBookIsNotThereInTheLibrary() {
        assertTrue(library.isAvailable("Sand Man"));
    }

    @Test
    void isAvailable_ShouldReturnFalseIfTheBookIsNotThereInTheLibrary() {
        assertFalse(library.isAvailable("Da Vinci Code"));
    }

    @Test
    void isAvailable_ShouldReturnFalseIfEveryCopiesOfTheBookHasRentOut() {
        librarian.lendBook("Da Vinci Code", reader1);
        assertFalse(library.isAvailable("Da Vinci Code"));
    }

    @Test
    void registerMember_ShouldReturnTrueIfTheReaderIsNewlyRegisteringWithTheLibrary() {
        Reader newReader = new Reader();
        assertTrue(library.registerMember(newReader));
    }

    @Test
    void registerMember_ShouldReturnFalseIfTheReaderIsAlreadyRegisteredWithTheLibrary() {
        assertFalse(library.registerMember(reader1));
    }

    @Test
    void addBookToLibrary_ShouldAddTheBookToLibraryAndIncreaseTheAvailabilityOfTheBook() {
        Book newBook = new Book("Objective Arithmetic");
        assertEquals(1,librarian.addBookToLibrary(newBook));
        assertEquals(2,librarian.addBookToLibrary(newBook));
    }

    @Test
    void getReadersByBook_ShouldProvideAllReadersOfTheGivenBook() {
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        Reader reader4 = new Reader();

        library.registerMember(reader2);
        library.registerMember(reader3);
        library.registerMember(reader4);

        librarian.addBookToLibrary(sandMan);
        librarian.addBookToLibrary(sandMan);
        librarian.addBookToLibrary(sandMan);

        librarian.lendBook("Sand Man", reader2);
        librarian.lendBook("Sand Man", reader3);
        librarian.lendBook("Sand Man", reader4);

        HashSet<Reader> expectedAllReaders = new HashSet<>();
        expectedAllReaders.add(reader2);
        expectedAllReaders.add(reader3);
        expectedAllReaders.add(reader4);

        assertEquals(expectedAllReaders, librarian.getReadersBy(sandMan));
    }

    @Test
    void getBorrowedBookByReader_ShouldProvideEmptyArrayIfNoBookIsBorrowedByOneReader() {
        HashSet<Book> expectedAllBooks = new HashSet<>();
        assertEquals(expectedAllBooks, librarian.getBorrowedBooksBy(reader1));
    }

    @Test
    void getBorrowedBookByReader_ShouldProvideAllBooksBorrowedByOneReader() {
        librarian.lendBook("Sand Man", reader1);
        librarian.lendBook("Eleven Minutes", reader1);
        librarian.lendBook("Five Little Pics", reader1);

        HashSet<Book> expectedAllBooks = new HashSet<>();
        expectedAllBooks.add(sandMan);
        expectedAllBooks.add(elevenMinutes);
        expectedAllBooks.add(fiveLittlePics);

        assertEquals(expectedAllBooks, librarian.getBorrowedBooksBy(reader1));
    }

    @Test
    void lendBook_ShouldReturnFalseWhenNonRegisterReaderTryToLendAnyBook() {
        Reader reader2 = new Reader();
        assertFalse(librarian.lendBook("Sand Man", reader2));
    }

    @Test
    void lendBook_ShouldReturnFalseWhenTheRequestedBookIsNotThere() {
        assertFalse(librarian.lendBook("Wings Of Fire", reader1));
    }


    @Test
    void lendBook_ShouldReturnTrueWhenTheRequestedAValidBook() {
        assertTrue(librarian.lendBook("Sand Man", reader1));
    }

    @Test
    void lendBook_ShouldAddTheLendBookToTheReadersBorrowedBook() {
        librarian.lendBook("Sand Man", reader1);
        assertTrue(reader1.getBorrowedBooks().contains(sandMan));
    }

    @Test
    void lendBook_ShouldRemoveTheLendBookFromTheLibrary() {
        librarian.lendBook("Sand Man", reader1);
        assertFalse(library.isAvailable("Sand Man"));
    }

    @Test
    void lendBook_ShouldRegisterTheBorrowerOfTheBookToBookRegister() {
        librarian.lendBook("Sand Man", reader1);
        assertTrue(librarian.getReadersBy(sandMan).contains(reader1));
    }

    @Test
    void lendBook_ShouldRegisterTheBookToTheReaderRegister() {
        librarian.lendBook("Sand Man", reader1);
        assertTrue(librarian.getBorrowedBooksBy(reader1).contains(sandMan));
    }

    @Test
    void removeBook_ShouldRemoveAllTheCopyOfTheGivenBookIfTheBookIsThere() {
        assertTrue(librarian.removeBook(sandMan));
    }

    @Test
    void removeBook_ShouldReturnFalseIfLibrarianTriesToRemoveBookThatIsNotBelongsToTheLibrary() {
        assertFalse(librarian.removeBook(new Book("Wings Of Fire")));
    }

    @Test
    void wasRemoved_ShouldReturnTrueIfTheGivenBookWasPreviouslyRemovedFromTheLibrary() {
        librarian.removeBook(sandMan);
        assertTrue(librarian.wasRemoved(sandMan));
    }

    @Test
    void wasRemoved_ShouldReturnFalseIfTheGivenBookWasNotRemovedFromTheLibrary() {
        assertFalse(librarian.wasRemoved(sandMan));
    }

    @Test
    void reAssignReturnedBook_ShouldReturnTrueAndAddReadersReturnedBookBackToTheLibraryForValidReaderAndBooks() {
        librarian.lendBook("Sand Man", reader1);
        assertTrue(librarian.reassignReturnedBook(sandMan, reader1));
    }

    @Test
    void reAssignReturnedBook_ShouldRemoveTheBorrowerFromTheBookRegister() {
        librarian.lendBook("Sand Man", reader1);
        librarian.reassignReturnedBook(sandMan, reader1);
        assertFalse(librarian.getReadersBy(sandMan).contains(reader1));
    }

    @Test
    void reAssignReturnedBook_ShouldRemoveTheBookFromTheReaderRegister() {
        librarian.lendBook("Sand Man", reader1);
        librarian.reassignReturnedBook(sandMan, reader1);
        assertFalse(librarian.getBorrowedBooksBy(reader1).contains(sandMan));
    }

    @Test
    void reAssignReturnedBook_ShouldReturnFalseForInValidBook() {
        librarian.lendBook("Sand Man", reader1);
        assertFalse(librarian.reassignReturnedBook(new Book("Wings Of Fire"), reader1));
    }

    @Test
    void reAssignReturnedBook_ShouldReturnFalseForBookThatTheReaderDontHave() {
        librarian.lendBook("Sand Man", reader1);
        assertFalse(librarian.reassignReturnedBook(elevenMinutes, reader1));
    }

    @Test
    void reAssignReturnedBook_ShouldReturnFalseForUnregisteredReader() {
        Reader reader2 = new Reader();
        assertFalse(librarian.reassignReturnedBook(elevenMinutes, reader2));
    }
}