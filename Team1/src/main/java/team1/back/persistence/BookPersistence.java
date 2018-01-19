package team1.back.persistence;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import team1.back.logic.Book;

public class BookPersistence {

    public static void createBook(Book book){
        MongoDatabase db = DBConnection.getClient().getDatabase("git_endava_library");
        MongoCollection<Document> books = db.getCollection("books");

        Document bookDoc = new Document("_id", book.getId())
                .append("name", book.getName())
                .append("author", book.getAuthor())
                .append("ISBN", book.getISBN())
                .append("published", book.getPublished())
                .append("language",book.getLanguage())
                .append("publisher",book.getPublisher());

        books.insertOne(bookDoc);
    }
}
