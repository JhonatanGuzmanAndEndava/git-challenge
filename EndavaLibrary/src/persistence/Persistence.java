package persistence;

import entities.Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persistence<T> {
    public Persistence() {
    }

    public void save(String path, Map<String, List<Book>> map) {
        try{
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(map);
            out.close();
            fileOut.close();
        } catch (Exception e) {
        }
    }

    public Map<String, List<Book>> load(String path) {
        Map<String, List<Book>> map = new HashMap<String, List<Book>>();
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            map = (Map<String, List<Book>>) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(Exception e) {
        }
        return map;
    }
}
