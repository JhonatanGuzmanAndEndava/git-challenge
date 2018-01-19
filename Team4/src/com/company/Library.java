package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    public HashMap<Integer,Book> libraryBooks = new HashMap<>();
    String file = "BooksData.txt";
    File data = new File(file);
    Scanner sc = new Scanner (System.in);
    int id;
    String name;
    public boolean createBook (Book lib){
        try {
            if(data.createNewFile()){
                lib.setId(1);
                libraryBooks.put(lib.getId(),lib);
                FileOutputStream fileOutputStream = new FileOutputStream(data);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(libraryBooks);
                objectOutputStream.close();
                fileOutputStream.close();
            }else{
                FileInputStream fileInputStream = new FileInputStream(data);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                libraryBooks = (HashMap<Integer, Book>)objectInputStream.readObject();

                if (libraryBooks.isEmpty())
                    id = 1;

                else
                    id = libraryBooks.get(libraryBooks.size()).getId()+1;
                lib.setId(id);
                libraryBooks.put(id,lib);
                FileOutputStream fileOutputStream = new FileOutputStream(data);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(libraryBooks);
                objectOutputStream.close();
                fileOutputStream.close();
                objectInputStream.close();
                fileInputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void showInfo() {
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            libraryBooks = (HashMap<Integer, Book>)objectInputStream.readObject();

            if (libraryBooks.isEmpty())
                System.out.println("\nThere are no books in the library.\n");

            else{

                for (Map.Entry<Integer, Book> entry : libraryBooks.entrySet()) {
                    System.out.println("Book's id: " + entry.getValue().getId());
                    System.out.println("Book's name: " + entry.getValue().getname());
                    System.out.println("Book's author: " + entry.getValue().getauthor());
                    System.out.println("Book's ISBN: " + entry.getValue().getISBN());
                    System.out.println("Book's published: " + entry.getValue().getpublished());
                    System.out.println("Book's language: " + entry.getValue().getlanguage());
                    System.out.println("Book's publisher: " + entry.getValue().getpublisher());
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void showSpecificInfo(int IDc){
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            libraryBooks = (HashMap<Integer, Book>)objectInputStream.readObject();
            if (libraryBooks.containsKey(IDc)){
                Book book = libraryBooks.get(IDc);
                System.out.println("Book's name: " + book.getname());
                System.out.println("Book's author: " + book.getauthor());
                System.out.println("Book's ISBN: " + book.getISBN());
                System.out.println("Book's published: " + book.getpublished());
                System.out.println("Book's language: " + book.getlanguage());
                System.out.println("Book's publisher: " + book.getpublisher());
                System.out.println();
            }else{
                System.out.println("ID doesn't found");
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void showUpdateInfo(int IDc) {
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            libraryBooks = (HashMap<Integer, Book>)objectInputStream.readObject();
            if (libraryBooks.containsKey(IDc)){
                Book book = libraryBooks.get(IDc);
                System.out.println("Book's name: " + book.getname());
                System.out.println("Book's author: " + book.getauthor());
                System.out.println("Book's ISBN: " + book.getISBN());
                System.out.println("Book's published: " + book.getpublished());
                System.out.println("Book's language: " + book.getlanguage());
                System.out.println("Book's publisher: " + book.getpublisher());
                System.out.println();
                System.out.println("What field wants edit of the book?");
                System.out.println("1. Book's name");
                System.out.println("2. Book's author");
                System.out.println("3. Book's ISBN");
                System.out.println("4. Book's published");
                System.out.println("5. Book's language");
                System.out.println("6. Book's publisher");
                System.out.println("7. All");
                System.out.println();
                int field = sc.nextInt();
                sc.nextLine();
                if (field == 1 ){
                    System.out.print("Enter the new book´s name: ");
                    name = sc.nextLine();
                    book.setname(name);
                    System.out.println("Change Successful");
                }
                if (field == 2 ){
                    System.out.print("Enter the new book´s author: ");
                    name = sc.nextLine();
                    book.setauthor(name);
                    System.out.println("Change Successful");
                }
                if (field == 3 ){
                    System.out.print("Enter the new book´s ISBN: ");
                    name = sc.nextLine();
                    book.setISBN(name);
                    System.out.println("Change Successful");
                }
                if (field == 4 ){
                    System.out.print("Enter the new book´s published: ");
                    name = sc.nextLine();
                    book.setpublished(name);
                    System.out.println("Change Successful");
                }
                if (field == 5 ){
                    System.out.print("Enter the new book´s language: ");
                    name = sc.nextLine();
                    book.setlanguage(name);
                    System.out.println("Change Successful");
                }
                if (field == 6 ){
                    System.out.print("Enter the new book´s publisher: ");
                    name = sc.nextLine();
                    book.setpublisher(name);
                    System.out.println("Change Successful");
                }
                if (field == 7 ){
                    System.out.print("Enter the new book´s name: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                    System.out.print("Enter the new book´s author: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                    System.out.print("Enter the new book´s ISBN: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                    System.out.print("Enter the new book´s published: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                    System.out.print("Enter the new book´s language: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                    System.out.print("Enter the new book´s publisher: ");
                    book.setname(sc.nextLine());
                    System.out.println("Change Successful");
                }
                libraryBooks.put(book.getId(),book);
            }else{
                System.out.println("ID doesn't found");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(data);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(libraryBooks);
            objectOutputStream.close();
            fileOutputStream.close();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void showDeleteInfo(int IDc) {
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            libraryBooks = (HashMap<Integer, Book>)objectInputStream.readObject();
            if (libraryBooks.containsKey(IDc)){
                Book book = libraryBooks.get(IDc);
                System.out.println("Book's name: " + book.getname());
                System.out.println("Book's author: " + book.getauthor());
                System.out.println("Book's ISBN: " + book.getISBN());
                System.out.println("Book's published: " + book.getpublished());
                System.out.println("Book's language: " + book.getlanguage());
                System.out.println("Book's publisher: " + book.getpublisher());
                System.out.println();
                System.out.println("Do you want delete this book?");
                System.out.println("Press 1 to delete or press any key for not");
                if (sc.nextInt()==1){
                    libraryBooks.remove(IDc);
                    System.out.println("Remove Successful");
                }
            }else{
                System.out.println("ID doesn't found");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(data);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(libraryBooks);
            objectOutputStream.close();
            fileOutputStream.close();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
