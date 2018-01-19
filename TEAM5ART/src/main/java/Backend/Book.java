package Backend;

public class Book {

    private int id;
    private String name;
    private String author;
    private String isbn;
    private String published;
    private String language;
    private String publisher;


    public Book(int id, String name, String author, String isbn, String published, String language, String publisher){
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
    }

    public Book(int id, String[] argumentsArray){
        this.id = id;
        this.name = argumentsArray[0];
        this.author = argumentsArray[1];
        this.isbn = argumentsArray[2];
        this.published = argumentsArray[3];
        this.language = argumentsArray[4];
        this.publisher = argumentsArray[5];
    }

    public java.lang.String getName() {
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

    @Override
    public String toString() {
        return  this.name+","+this.author+","+this.isbn+","+this.published+","+this.language+","+this.publisher;
    }
}