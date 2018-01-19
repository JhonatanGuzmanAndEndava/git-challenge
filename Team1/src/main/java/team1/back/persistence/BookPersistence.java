package team1.back.persistence;

import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import team1.back.logic.Book;

public class BookPersistence {

    public static MongoCollection<Document> getCollection(){
        return DBConnection.getClient().getDatabase("git_endava_library").getCollection("books");
    }

    public static void createBook(Book book){

        MongoCollection<Document> books = getCollection();

        Document bookDoc = new Document("_id", book.getId())
                .append("name", book.getName())
                .append("author", book.getAuthor())
                .append("ISBN", book.getISBN())
                .append("published", book.getPublished())
                .append("language",book.getLanguage())
                .append("publisher",book.getPublisher());

        books.insertOne(bookDoc);
    }

    public static Book getBook(int id){

        MongoCollection<Document> books = getCollection();
        Document bookDoc = books.find(eq("_id",id)).first();

        Book book = null;
        if(bookDoc != null){
            String name, author, published, language, publisher;
            int ISBN;

            name = bookDoc.getString("name");
            author = bookDoc.getString("author");
            ISBN = bookDoc.getInteger("ISBN");
            published = bookDoc.getString("published");
            language = bookDoc.getString("language");
            publisher = bookDoc.getString("publisher");

            book = new Book(id, name, author, ISBN, published, language, publisher);
        }
        return book;
    }

    public static void updateBook(Book book) {
        MongoCollection<Document> books = getCollection();

        Document bookDoc = new Document("name", book.getName())
                .append("author", book.getAuthor())
                .append("ISBN", book.getISBN())
                .append("published", book.getPublished())
                .append("language", book.getLanguage())
                .append("publisher", book.getPublisher());

        books.updateOne(eq("_id", book.getId()), new Document("$set", bookDoc));
    }

    public static void deleteBook(int id){
        //We assume said ID exists from the logic layer
        MongoCollection<Document> books = getCollection();

        books.deleteOne(eq("_id",id));

    }
}
