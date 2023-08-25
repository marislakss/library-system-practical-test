// This class represents a Book with a title and an author.
public class Book {
    private String title;  // Title of the book
    private String author; // Author of the book

    // Constructor to initialize a book with a title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Setter for the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the author
    public String getAuthor() {
        return author;
    }

    // Setter for the author
    public void setAuthor(String author) {
        this.author = author;
    }
}
