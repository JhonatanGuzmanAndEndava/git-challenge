package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        int option;
        Biblioteca library = new Biblioteca();
        String name;
        String author;
        String ISBN;
        String published;
        String language;
        String publisher;
        while(exit==false){
            System.out.println("Please choose one option");
            System.out.println("1: Create book");
            System.out.println("0: Exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.print("Enter book´s name: ");
                    name = sc.nextLine();
                    System.out.print("Enter book´s author: ");
                    author = sc.nextLine();
                    System.out.print("Enter book´s ISBN code: ");
                    ISBN = sc.nextLine();
                    System.out.print("Enter published date: ");
                    published = sc.nextLine();
                    System.out.print("Enter book´s language: ");
                    language = sc.nextLine();
                    System.out.print("Enter book´s publisher: ");
                    publisher = sc.nextLine();
                    Libro lib = new Libro(name,author,ISBN,published,language,publisher);
                    library.createBook(lib);
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }


    }
}
