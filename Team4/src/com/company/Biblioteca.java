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
                printWriter.write(lib.getISBN());
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }else{
                System.out.println("ya existo");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
