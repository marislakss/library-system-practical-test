import java.util.ArrayList;
import java.util.List;

// This class represents a Library which can store books and perform operations like adding a book and checking if a book exists.
public class Library {
    private final List<Book> books = new ArrayList<>();  // List to store books

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to check if a book exists in the library based on its title
    public boolean bookExists(String title) {
        return books.stream().anyMatch(book -> book.getTitle().equals(title));
    }
}
