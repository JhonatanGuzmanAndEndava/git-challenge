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

    //Getters and Setters
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getauthor(){
        return author;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getpublished(){
        return published;
    }
    public void setpublished(String published){
        this.published = published;
    }
    public String getlenguage(){
        return lenguage;
    }
    public void setlenguage(String lenguage){
        this.lenguage = lenguage;
    }
    public String getpublisher(){
        return publisher;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
}
