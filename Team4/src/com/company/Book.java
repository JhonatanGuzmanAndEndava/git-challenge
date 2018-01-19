package com.company;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private String ISBN;
    private String published;
    private String language;
    private String publisher;
    private String state;
    private int id;

    public Book(String name, String author, String ISBN, String published, String language, String publisher) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.published = published;
        this.language = language;
        this.publisher = publisher;
        this.state = "Disponible";
        this.id = 1;
    }

    //Get's and Set's
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
    public String getlanguage(){
        return language;
    }
    public void setlanguage(String language){
        this.language = language;
    }
    public String getpublisher(){
        return publisher;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
