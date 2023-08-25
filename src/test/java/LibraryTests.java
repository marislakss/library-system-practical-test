import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// This class contains unit tests for the Library class.
class LibraryTests {
    private Library library;  // Instance of the Library class for testing

    // This method runs before each test and initializes the library instance.
    @BeforeEach
    void setUp() {
        library = new Library();
    }

    // Test to check adding a book to an empty library
    @Test
    void testAddBookToEmptyLibrary() {
        Book book = new Book("Harry Potter", "J.K. Rowling");
        library.addBook(book);
        assertTrue(library.bookExists("Harry Potter"));
    }

    // Test to check if a book exists in a library that has books
    @Test
    void testBookExistsInLibraryWithBooks() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.bookExists("The Great Gatsby"));
    }

    // Test to check if a book exists in an empty library
    @Test
    void testBookDoesNotExistInEmptyLibrary() {
        assertFalse(library.bookExists("The Great Gatsby"));
    }
}