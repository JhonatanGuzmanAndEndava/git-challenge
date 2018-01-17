package entities;
import java.io.*;

public class Book implements Serializable {


    private String name;
    private Integer copy;
    private String author;
    private String isbn;
    private String published;
    private String language;
    private String publisher;

    public Book(String name, String author, String isbn, String published, String language, String publisher, Integer copy) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
        this.copy = copy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String isPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getCopy() {
        return copy;
    }

    public void setCopy(Integer copy) {
        this.copy = copy;
    }
}
