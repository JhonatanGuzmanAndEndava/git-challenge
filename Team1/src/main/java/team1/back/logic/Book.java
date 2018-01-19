package team1.back.logic;
import team1.back.persistence.BookPersistence;

public class Book {
    private int id;
    private String name;
    private String author;
    private int ISBN;
    //TODO Change to date in the future
    private String published;
    private String language;
    private String publisher;

    public Book() {
    }

    public Book(int id, String name, String author, int ISBN, String published, String language, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
    }

    //Getters and Setters
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //CRUD methods
    //Create Book
    public static Book createBook(int id, String name, String author, int ISBN, String published, String language, String publisher){
        Book newBook = new Book(id, name, author, ISBN, published, language, publisher);
        BookPersistence.createBook(newBook);
        return newBook;
    }

    //Read Book
    public static Book readBook(int id){
        return BookPersistence.getBook(id);
    }

    public static Book updateBook(Book book){

        Book updatedBook = null;
        if(readBook(book.getId()) != null){
            BookPersistence.updateBook(book);
            updatedBook = book;
        }
        return updatedBook;
    }

    public static Book deleteBook(int id){

        Book deletedBook = readBook(id);
        if(deletedBook != null){
            BookPersistence.deleteBook(id);
        }
        return deletedBook;
    }
}
