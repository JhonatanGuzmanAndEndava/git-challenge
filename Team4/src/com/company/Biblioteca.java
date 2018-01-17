package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Biblioteca {
    public boolean createBook (Libro lib){
        String file = "BooksData.txt";
        File data = new File(file);
        try {
            if(data.createNewFile()){
                FileWriter fileWriter = new FileWriter(data);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                printWriter.write("ISBN code: " + lib.getISBN() + "\n");
                printWriter.write("Name: " + lib.getname() + "\n");
                printWriter.write("Author: " + lib.getauthor() + "\n");
                printWriter.write("Published: " + lib.getpublished() + "\n");
                printWriter.write("Language: " + lib.getlenguage() + "\n");
                printWriter.write("Publisher: " + lib.getpublisher() + "\n");
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }else{
                System.out.println("existo");
                FileWriter fileWriter = new FileWriter(data, true);
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
                fileWriter.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
