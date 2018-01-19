package entities;
import java.io.*;

public class Book implements Serializable {

    private String id;
    private String name;
    private String author;
    private String isbn;
    private String published;
    private String language;
    private String publisher;
    private Status status;

    public Book(String id, String name, String author, String isbn, String published, String language, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
        this.status = Status.AVAILABLE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPublished() {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nId: " + this.id + "\nTitle: " + this.name + "\nAuthor: " + this.author + "\nStatus: " + this.status.toString();
    }
}
