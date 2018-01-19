package entities;

import persistence.Persistence;

import java.util.*;

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

    public List<Book> readBook(String query, int option) {
        List<Book> matches = new ArrayList<Book>();
        List<Book> list;
        switch(option){
            case 1:
                matches = this.books.get(query);
                break;
            case 2:
                for(String key : this.books.keySet()) {
                    list = this.books.get(key);
                    for(Book book : list) {
                        if(book.getName().contentEquals(query)) {
                            matches.add(book);
                        }
                    }
                }
                break;
            case 3:
                for(String key : this.books.keySet()) {
                    list = this.books.get(key);
                    for(Book book : list) {
                        if(book.getAuthor().contentEquals(query)) {
                            matches.add(book);
                        }
                    }
                }
                break;
            default:
                matches = null;
                break;
        }
        return matches;
    }

    public boolean updateBook(int bookId) {
        return false;
    }

    public boolean deleteBook(int bookId) {
            return false;
    }

    public void getAllBooks() {
        this.books = persistence.load("./endavaLibrary.lol");
    }
}
