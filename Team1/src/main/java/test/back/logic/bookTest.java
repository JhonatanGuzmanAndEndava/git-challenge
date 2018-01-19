package test.back.logic;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import team1.back.logic.Book;


public class bookTest
{

    private Book book;

    @BeforeEach
    public void setup ()
    {
        int id = (int)(Math.random()*100000);
        String name = "Harry Potter" ;
        String author = "J.K Rowling";
        int isbn = 1;
        String published = "25/10/1998" ;
        String language = "English";
        String publisher = "Panamericana";
        book = Book.createBook(id, name,author,isbn,published,language,publisher);
    }
    @Test
    public void bookCreateTest()
    {

        Assertions.assertNotNull(book);
    }
    @Test
    public void bookReadTest()
    {

        int inexistingId = 231213;

        Assertions.assertNotNull(Book.readBook(book.getId()),"Shouldn't have been null, this object exist");
        //Throws exception when given Id doesn't exist
        Assertions.assertNull(Book.readBook(inexistingId),"Should have been null, this object doesn't exist");
    }
    
    @Test
    public void bookDeleteTest()
    {

        int existingId = 1;
        
        Assertions.assertNotNull(Book.deleteBook(book.getId()),"Shouldn't have been null, this object exists and wasn't deleted");
        Assertions.assertNull(Book.deleteBook(existingId),"Should have been null, this object doesnt't exist ");

    }
    
    @Test
    public void bookUpdateTest()
    {
        int id = book.getId();
        String nameUpdated = "La Locura Potter" ;
        String authorUpdated = "J.K Bowling";
        int isbnUpdated = 55;
        String publishedUpdated = "01/01/2018" ;
        String languageUpdated = "English";
        String publisherUpdated = "Panamericana";

        //Setting up
        Book toUpdate = Book.readBook(1);
        Book updated = Book.updateBook(new Book(book.getId(),"La Locura Potter","J.K Bowling",55,"01/01/2018","English","Panamericana"));


        //Not null
        Assertions.assertNotNull(updated);

        Assertions.assertEquals(nameUpdated, updated.getName());
        Assertions.assertEquals(authorUpdated, updated.getAuthor());
        Assertions.assertEquals(isbnUpdated, updated.getISBN());
        Assertions.assertEquals(publishedUpdated, updated.getPublished());
        Assertions.assertEquals(languageUpdated, updated.getLanguage());
        Assertions.assertEquals(publisherUpdated, updated.getPublisher());
    }


    @AfterEach
    public void exit()
    {
        if(book!=null)
       Book.deleteBook(book.getId());
    }
}
