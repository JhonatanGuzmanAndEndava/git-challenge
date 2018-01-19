package Backend;

import java.util.HashMap;
import java.util.Map;

public class BookList {
    private static BookList instance;
    public HashMap<Integer, Book> bookList;
    private Integer highestID;

    private BookList(){
        bookList = new HashMap<Integer, Book>();
        this.highestID = -1;
    }

    public static BookList getInstance(){
        if(instance == null){
            instance = new BookList();
        }
        return instance;
    }

    public HashMap<Integer, Book> getBookList() {
        return bookList;
    }

    public  Integer getHighestID(){
        return highestID;
    }

    public void setHighestID(Integer highestID) {
        this.highestID = highestID;
    }

    @Override
    public String toString() {
        String result = new String();
        for(Map.Entry<Integer, Book> bookEntry : bookList.entrySet()){
            Integer key = bookEntry.getKey();
            Book value = bookEntry.getValue();

            result += "["+ key.toString() +"]|[" + value.toPersist() + "]\n";
        }
        return result;
    }
}
