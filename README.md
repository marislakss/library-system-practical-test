# LibrarySystem

This project is a Java application that represents a Book with a title and an author.

## Getting Started

To get started with this project, you can follow these steps:

1. Clone the repository: `git clone <https://github.com/marislakss/library-system-practical-test.git>`
2. Open the project in your IntelliJ IDEA.
3. Build the project using the IDE's Maven build tools.
4. Run the application.

## Usage

The `Book` class provides the following methods:

- `getTitle()`: Returns the title of the book.
- `setTitle(String title)`: Sets the title of the book.
- `getAuthor()`: Returns the author of the book.
- `setAuthor(String author)`: Sets the author of the book.

You can use these methods to create and manipulate Book objects in your application.

## Example

Here's an example of how to use the `Book` class:

// Create a new Book object Book book = new Book("Title", "Author");

// Get the title of the book String title = book.getTitle(); 
System.out.println("Title: " + title);

// Set a new title for the book book.setTitle("New Title");

// Get the updated title of the book String updatedTitle = book.getTitle(); 
System.out.println("Updated Title: " + updatedTitle);


## Contributing

If you'd like to contribute to this project, feel free to submit a pull request. 
Please make sure to follow the coding conventions and include tests for any new features or bug fixes.

## License

This project is licensed under the MIT License.