package com.company;

public class Libro {
    private String name;
    private String author;
    private String ISBN;
    private String published;
    private String language;
    private String publisher;

    public Libro(String name, String author, String ISBN, String published, String language, String publisher) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
    }
}
