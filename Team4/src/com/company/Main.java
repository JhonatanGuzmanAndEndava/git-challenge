package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1: Create book");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Biblioteca library = new Biblioteca();
        String name;
        String author;
        String ISBN;
        String published;
        String language;
        String publisher;
        switch (option){
            case 1:
                System.out.print("Enter book´s name: ");
                name = sc.next();
                System.out.print("Enter book´s author: ");
                author = sc.next();
                System.out.print("Enter book´s ISBN code: ");
                ISBN = sc.next();
                System.out.print("Enter published date: ");
                published = sc.next();
                System.out.print("Enter book´s language: ");
                language = sc.next();
                System.out.print("Enter book´s publisher: ");
                publisher = sc.next();
                Libro lib = new Libro(name,author,ISBN,published,language,publisher);
                library.createBook(lib);
                break;
        }

    }
}
