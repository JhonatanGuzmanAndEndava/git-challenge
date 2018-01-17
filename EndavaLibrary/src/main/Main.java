package main;

import entities.Library;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static Library library;
//pruebaklasjdklajsd
    public static void main(String args[]) {
        input = new Scanner(System.in);
        int option;
        library = new Library();
        library.getAllBooks();
        do{
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. Create book");
            System.out.println("2. Read book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Exit");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    create();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    if(option != 5) {
                        System.out.println("Wrong input");
                    }
                    break;
            }
        }
        while(option != 5);
    }

    public static void create() {
        String name, author, isbn, published, language, publisher;
        Integer copy;
        System.out.println("Name: ");
        name = input.nextLine();
        System.out.println("Author: ");
        author = input.nextLine();
        System.out.println("Isbn: ");
        isbn = input.nextLine();
        System.out.println("Published: ");
        published = input.nextLine();
        System.out.println("Language: ");
        language = input.nextLine();
        System.out.println("Publisher: ");
        publisher = input.nextLine();
        library.createBook(name, author, isbn, published, language, publisher);
    }
}
