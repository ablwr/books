package book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String title;
    private String description;
    private String isbn;
    private String author;

    protected Book() {}

    public Book(long id, String title, String description, String isbn, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, title='%s', description='%s', isbn='%s', author='%s']",
                id, title, description, isbn, author);
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}