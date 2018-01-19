package main;

import entities.Book;
import entities.Library;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static Library library;

    public static void main(String args[]) {
        input = new Scanner(System.in);
        int option;
        library = new Library();
        library.getAllBooks();
        option = 0;
        do{
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. Create book");
            System.out.println("2. Read book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Exit");
            try {
                option = Integer.parseInt(input.nextLine());
                switch (option) {
                    case 1:
                        create();
                        break;
                    case 2:
                        read();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    default:
                        if(option != 5) {
                            System.out.println("Wrong input");
                        }
                        break;
                }
            }
            catch(Exception e) {
                option = 0;
            }
        }
        while(option != 5);
    }

    public static void create() {
        String name, author, isbn, published, language, publisher;
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
        System.out.println("\nBook created\n");
    }

    public static boolean read() {
        String query;
        int option;
        boolean exist = false;
        System.out.println("Please provide your criteria");
        System.out.println(" [1] ISBN");
        System.out.println(" [2] Title");
        System.out.println(" [3] Author");
        try {
            option = Integer.parseInt(input.nextLine());
            System.out.println("Please provide your request");
            query = input.nextLine();
            List<Book> result = library.readBook(query, option);
            if(result == null) {
                System.out.println("\nNo matches found\n");
            }
            else {
                exist = true;
                for(Book book : result) {
                    System.out.println(book.toString());
                }
            }
        }
        catch(Exception e) {
            System.out.println("Wrong input");
        }
        return exist;
    }

    public static void update() {
        int bookId;
        boolean exist;
        if(read()) {
            System.out.println("\nChoose book to update");
            bookId = Integer.parseInt(input.nextLine());
            exist = library.updateBook(bookId);
            if(exist) {
                System.out.println("\nBook updated\n");
            }
            else {
                System.out.println("\nNo id found\n");
            }
        }
    }

    public static void delete() {
        int bookId;
        boolean exist;
        if(read()) {
            System.out.println("\nChoose book id to delete");
            bookId = Integer.parseInt(input.nextLine());
            exist = library.deleteBook(bookId);
            if(exist) {
                System.out.println("\nBook deleted\n");
            }
            else {
                System.out.println("\nNo id found\n");
            }
        }
    }
}
