package entities;

import persistence.Persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String name;
    private List<Book> books;
    private Persistence<Book> persistence;
    private Map<String, Integer> copies;

    public Library() {
        this.name = "Endava's library";
        this.books = new ArrayList<Book>();
        this.persistence = new Persistence<Book>();
        this.copies = new HashMap<String,Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void createBook(String name, String author, String isbn, String published, String language, String publisher) {
        Integer copy = 1;
        if(copies.get(name)==null){
            copies.put(name,1);
        }else{
            copy = copies.get(name)+1;
            copies.replace(name,copy);

        }
        //System.out.println("Copy: "+copy);
        books.add(new Book(name, author, isbn, published, language, publisher, copy));
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
