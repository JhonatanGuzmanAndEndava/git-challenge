package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean exit = false;
        int option;
        Library library = new Library();
        String name;
        String author;
        String ISBN;
        String published;
        String language;
        String publisher;
        int IDc;

        while(exit==false){
            System.out.println("Please choose one option");
            System.out.println("1: Create book");
            System.out.println("2: Read the information for an specific book");
            System.out.println("3: Update the information of an specific book");
            System.out.println("4: Delete an specific book");
            System.out.println("5: Show library books info");
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
                    Book lib = new Book(name,author,ISBN,published,language,publisher);
                    library.createBook(lib);
                    System.out.println("Successful creation");
                    break;
                case 2:
                    System.out.print("Enter the ID number of the book: ");
                    IDc = (sc.nextInt());
                    library.showSpecificInfo(IDc);
                    break;
                case 3:
                    System.out.print("Enter the ID number of the book: ");
                    IDc = (sc.nextInt());
                    library.showUpdateInfo(IDc);
                    break;
                case 4:
                    System.out.print("Enter the ID number of the book: ");
                    IDc = (sc.nextInt());
                    library.showDeleteInfo(IDc);
                    break;
                case 5:
                    library.showInfo();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }


    }
}