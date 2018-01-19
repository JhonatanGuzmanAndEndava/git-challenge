package Backend;

import java.io.File;
import java.nio.file.Paths;
import java.io.*;
import java.nio.file.Files;

public class StorageController {

    private void persistDatabase(){
        BookList list = BookList.getInstance();
        File file = new File("db.txt");

        try {
            Files.deleteIfExists(file.toPath());
            Files.createFile(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            try (BufferedWriter writer = Files.newBufferedWriter(file.toPath()))
            {
                writer.write(list.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDatabase(){
        BookList list = BookList.getInstance();

        try {
            if (!Files.exists(Paths.get("db.txt"))) {
                Files.createFile(Paths.get("db.txt"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(list.getBookList().isEmpty()){
            try {
                try(BufferedReader br = new BufferedReader(new FileReader(new File("db.txt")))) {
                    for(String line; (line = br.readLine()) != null; ) {
                        System.out.println(line);
                        String[] res = line.split("\\|");
                        Integer hid = new Integer(res[0].substring(1,res[0].length()-1));
                        list.getBookList().put(hid,new Book(hid.intValue(), res[1].substring(1,res[1].length()-1).split(",")));
                        if(list.getHighestID().compareTo(hid) < 0) list.setHighestID(hid);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createBook(String name,
                           String author,
                           String isbn,
                           String published,
                           String language,
                           String publisher) {
        BookList list = BookList.getInstance();
        Integer id = list.getHighestID()+1;
        list.getBookList().put(id,new Book(id.intValue(), name,author,isbn,published,language,publisher));
        list.setHighestID(id);
        this.persistDatabase();
    }
}