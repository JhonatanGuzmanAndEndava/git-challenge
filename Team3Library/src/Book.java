
//Hacer revase hacia dev

public class Book {

    private String title; //Name
    private String author;
    private int id;
    private String isbn;
    private int year;
    private String lang;
    private String publisher;

    public Book () {
    }

    public Book (String title, String author, int id, int year, String lang, String publisher,String isbn) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.year = year;
        this.lang = lang;
        this.publisher = publisher;
        this.isbn=isbn;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getAuthor () {
        return author;
    }

    public String getIsbn () {
        return isbn;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }
    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getLang () {
        return lang;
    }

    public void setLang (String lang) {
        this.lang = lang;
    }

    public String getPublisher () {
        return publisher;
    }

    public void setPublisher (String publisher) {
        this.publisher = publisher;
    }

}


