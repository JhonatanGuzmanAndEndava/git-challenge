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
        String id;
        Book book;
        List<Book> list = books.get(isbn);
        if(list == null) {
            id = isbn+"_"+0;
            list = new ArrayList<Book>();
        }
        else {
            String lastId= list.get(list.size()-1).getId();
            int pos = Integer.parseInt(lastId.charAt(lastId.length()-1)+"");
            id = isbn + "_"+(pos+1);
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
            case 4:
                String[] key = query.split("_");
                matches.add(books.get(key[0]).get(Integer.parseInt(key[1])));
                break;
            default:
                matches = null;
                break;
        }
        return matches;
    }

    public boolean updateBook(String bookId, String name, String author, String published, String language, String publisher) {
        List<Book> list;
        boolean exist = false;
        String[] isbn = bookId.split("_");
          for(Book b:  books.get(isbn[0])){
              if(b.getId().contentEquals(bookId)){
                    b.setAuthor(author);
                    b.setLanguage(language);
                    b.setName(name);
                    b.setPublished(published);
                    b.setPublisher(publisher);
                    exist = true;
                    break;
              }
          }

        persistence.save("./endavaLibrary.lol", books);
        return exist;
    }

    public boolean deleteBook(String bookId) {
            return false;
    }

    public void getAllBooks() {
        this.books = persistence.load("./endavaLibrary.lol");
    }
}
