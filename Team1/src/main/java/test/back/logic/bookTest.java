package test.back.logic;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import team1.back.logic.Book;


public class bookTest
{

    @Before
    public void setup ()
    {

    }
    @Test
    public void bookCreateTest()
    {
        int id = 1;
        String name = "Harry Potter" ;
        String author = "J.K Rowling";
        int isbn = 1;
        String published = "25/10/1998" ;
        String language = "English";
        String publisher = "Panamericana";

        Assertions.assertNotNull(Book.createBook(id, name,author,isbn,published,language,publisher));
    }

    @Test
    public void bookGettersTest()
    {

    }

    @Test
    public void bookSettersTest()
    {

    }

    @After
    public void exit()
    {

    }
}
