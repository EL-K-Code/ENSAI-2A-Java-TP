package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book extends Item {

    // Attributes
    private String isbn;
    private Author author;

    /**
     * Constructs a new Book object.
     */
    public Book(String title, int year, int pageCount, String isbn, Author author) {
        super(title, year, pageCount);
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book " + title + " written by " + author.toString();
    }

}
