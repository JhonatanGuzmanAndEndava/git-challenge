package Testing;

import Backend.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bookTests {

    @Test
    public void Testcreador()
    {
        int id =2;
        String name="Crimen y castigo";
        String author="Fiódor Dostoyevski";
        String isbn = "9788897572657";
        String published = "12/06/1866";
        String language = "English";
        String publisher = "El Mensajero Ruso";
        Book libro1 = new Book(id,name,author,isbn,published,language,publisher);

        Assertions.assertNotNull(libro1);
    }

    @Test
    public void getters()
    {
        int id =2;
        String name="Crimen y castigo";
        String author="Fiódor Dostoyevski";
        String ISBN = "9788897572657";
        String published = "12/06/1866";
        String language = "English";
        String publisher = "El Mensajero Ruso";
        Book libro1 = new Book(id,name,author,ISBN,published,language,publisher);

        Assertions.assertEquals(id,libro1.getId());
        Assertions.assertEquals(name,libro1.getName());
        Assertions.assertEquals(author,libro1.getAuthor());
        Assertions.assertEquals(ISBN,libro1.getIsbn());
        Assertions.assertEquals(published,libro1.getPublished());
        Assertions.assertEquals(language,libro1.getLanguage());
        Assertions.assertEquals(publisher,libro1.getPublisher());
    }


}
