package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Library {
    public HashMap<String,Book> libraryBooks = new HashMap<>();
    public boolean createBook (Book lib){
        String file = "BooksData.txt";
        File data = new File(file);
        Scanner sc = new Scanner (System.in);
        try {
            if(data.createNewFile()){
                libraryBooks.put(lib.getISBN(),lib);
                FileOutputStream fileOutputStream = new FileOutputStream(data);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(libraryBooks);
                objectOutputStream.close();
                fileOutputStream.close();
                /*r printWriter = new PrintWriter(bufferedWriter);
                printWriter.write("ISBN code: " + lib.getISBN() + "\n");
                printWriter.write("Name: " + lib.getname() + "\n");
                printWriter.write("Author: " + lib.getauthor() + "\n");
                printWriter.write("Published: " + lib.getpublished() + "\n");
                printWriter.write("Language: " + lib.getlenguage() + "\n");
                printWriter.write("Publisher: " + lib.getpublisher() + "\n");
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();*/
            }else{
                FileInputStream fileInputStream = new FileInputStream(data);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                libraryBooks = (HashMap<String,Book>)objectInputStream.readObject();
                if(libraryBooks.containsKey(lib.getISBN())){
                    Book book = libraryBooks.get(lib.getISBN());
                    System.out.println("This book already exists in the library data base - " + book.getname());
                    System.out.println("Do you want add it one more copy?");
                    System.out.println("Press 1 to add or any key to go back to the menu");
                    String option = sc.next();
                    if(option.equalsIgnoreCase("1")){
                        book.setQuantity(book.getQuantity()+1);
                    }

                }
                objectInputStream.close();
                fileInputStream.close();
                /*FileWriter fileWriter = new FileWriter(data, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                printWriter.write("\n");
                printWriter.write("ISBN code: " + lib.getISBN() + "\n");
                printWriter.write("Name: " + lib.getname() + "\n");
                printWriter.write("Author: " + lib.getauthor() + "\n");
                printWriter.write("Published: " + lib.getpublished() + "\n");
                printWriter.write("Language: " + lib.getlenguage() + "\n");
                printWriter.write("Publisher: " + lib.getpublisher() + "\n");
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();*/

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
}
