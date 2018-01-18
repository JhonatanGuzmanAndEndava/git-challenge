package entities;

import persistence.Persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String name;
    private Map<String, List<Book>> books;
    private Persistence<Book> persistence;

    public Library() {
        this.name = "Endava's library";
        this.books = new HashMap<String, List<Book>>();
        this.persistence = new Persistence<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<Book>> getBooks() {
        return books;
    }

    public void setBooks(Map<String, List<Book>> books) {
        this.books = books;
    }

    public void createBook(String name, String author, String isbn, String published, String language, String publisher) {
        int id;
        Book book;
        List<Book> list = books.get(isbn);
        if(list == null) {
            id = 0;
            list = new ArrayList<Book>();
        }
        else {
            id = books.get(isbn).get(books.get(isbn).size() - 1).getId() + 1;
        }
        book = new Book(id, name, author, isbn, published, language, publisher);
        list.add(book);
        books.put(isbn, list);
        persistence.save("./endavaLibrary.lol", books);
    }

    public void readBook() {

    }

    public void updateBook() {

    }

    public void deleteBook() {

    }

    public void getAllBooks() {
        this.books = persistence.load("./endavaLibrary.lol");
    }
}
