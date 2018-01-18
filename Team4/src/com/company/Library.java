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
            for(Map.Entry<Integer,Book> entry : libraryBooks.entrySet()){
                System.out.println("Book's id: " + entry.getValue().getId());
                System.out.println("Book's name: " + entry.getValue().getname());
                System.out.println("Book's author: " + entry.getValue().getauthor());
                System.out.println("Book's ISBN: " + entry.getValue().getISBN());
                System.out.println("Book's published: " + entry.getValue().getpublished());
                System.out.println("Book's language: " + entry.getValue().getlenguage());
                System.out.println("Book's publisher: " + entry.getValue().getpublisher());
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
}
