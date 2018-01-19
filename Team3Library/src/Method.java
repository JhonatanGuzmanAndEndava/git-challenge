
import java.util.ArrayList;
import java.util.Scanner;


public class Method {

    public ArrayList<Book> list;


    //Devuelve la info de un libro


    public ArrayList <Book> Rlist () {
        return list;
    }

    //Create a New Book

    public ArrayList<Book> newBook (ArrayList<Book> books) {
        Scanner sc =  new Scanner(System.in);
        Book book = new Book();
        String title;
        String author;
        int id;
        int year;
        String lang;
        String isbn;
        String publisher;
        System.out.println("Write the id: ");
        id = sc.nextInt();
        System.out.println("Write the title: ");
        title = sc.next();
        System.out.println("Write the author: ");
        author = sc.next();
        System.out.println("Write the isbn: ");
        isbn = sc.next();
        System.out.println("Write the year: ");
        year = sc.nextInt();
        System.out.println("Write the lang: ");
        lang = sc.next();
        System.out.println("Write the publisher: ");
        publisher = sc.next();

        book.setTitle(title);
        book.setAuthor(author);
        book.setId(id);
        book.setYear(year);
        book.setLang(lang);
        book.setPublisher(publisher);
        book.setIsbn(isbn);
        books.add(book);
        return books;
    }

    public ArrayList<Book> searchBookId (int id,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getId() == (id)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }

    //Read the information for an specific book

    //According title /Name
    public ArrayList<Book> searchBookTittle (String title,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getTitle().equals(title)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }

    //Acording  Author

    public ArrayList<Book> searchBookAuthor (String author,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getAuthor().equals(author)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }



    //Acording ISBN

    public ArrayList<Book> searchBookIsbn (String isbn,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getIsbn().equals(isbn)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }

    // Acording published //Year


    public ArrayList<Book> searchBookYear (int year,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getYear() == year){
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }

    //Acording to language //lang

    public ArrayList<Book> searchBookLang (String lang,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getLang().equals(lang)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }


    //Acording to Publisher

    public ArrayList<Book> searchBookPublisher (String publisher,ArrayList<Book> books) {
        ArrayList<Book> bookfind = new ArrayList<Book>();
        int i = 0;
        while (i < books.size()) {
            Book actual = books.get(i);
            if (actual.getPublisher().equals(publisher)) {
                bookfind.add(actual);
            }
            i++;
        }
        return bookfind;
    }

    public void printBook(ArrayList<Book> books){
        for(Book book : books) {
            System.out.println("id: "+book.getId());
            System.out.println("title: "+book.getTitle());
            System.out.println("author: "+book.getAuthor());
            System.out.println("isbn: "+book.getIsbn());
            System.out.println("year: "+book.getYear());
            System.out.println("lang: "+book.getLang());
            System.out.println("publisher: "+book.getPublisher());
            System.out.println("--------------------");
        }
        System.out.println("=================");
    }

// How many books have the same Isbn

    public static  ArrayList<Book> deleteBookId(ArrayList<Book> books) {
        System.out.println("Write the id book");
        int id;
        Scanner sc =  new Scanner(System.in);
        id = sc.nextInt();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getId() == id){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static  ArrayList<Book> deleteBookTitle(ArrayList<Book> books) {
        System.out.println("Write the title book");
        String title;
        Scanner sc =  new Scanner(System.in);
        title = sc.nextLine();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getTitle().equals(title)){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static  ArrayList<Book> deleteBookAutor(ArrayList<Book> books) {
        System.out.println("Write the author book");
        String author;
        Scanner sc =  new Scanner(System.in);
        author = sc.nextLine();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getAuthor().equals(author)){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static  ArrayList<Book> deleteBookIsbn(ArrayList<Book> books) {
        System.out.println("Write the isbn book");
        String isbn;
        Scanner sc =  new Scanner(System.in);
        isbn = sc.nextLine();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getIsbn().equals(isbn)){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static  ArrayList<Book> deleteBookYear(ArrayList<Book> books) {
        System.out.println("Write the year book");
        int year;
        Scanner sc =  new Scanner(System.in);
        year = sc.nextInt();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getYear() == year){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static  ArrayList<Book> deleteBookLang(ArrayList<Book> books) {
        System.out.println("Write the lang book");
        String lang;
        Scanner sc =  new Scanner(System.in);
        lang = sc.nextLine();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getLang().equals(lang)){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }
    public static  ArrayList<Book> deleteBookPublsher(ArrayList<Book> books) {
        System.out.println("Write the lang publisher");
        String publisher;
        Scanner sc =  new Scanner(System.in);
        publisher = sc.nextLine();
        int countbookdelete = 0;
        for (int i = 0; i < books.size();i++){
            if (books.get(i).getPublisher().equals(publisher)){
                countbookdelete ++;
                books.remove(i);
                break;
            }
        }
        System.out.println("Deleted: "+countbookdelete+" register");
        System.out.println("=================");
        return books;
    }

    public static ArrayList<Book> updateBook (ArrayList<Book> library){
        System.out.println("Write the id");
        int id;
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        int cont =1;
        for( int i = 1; i < library.size( ); i++ ) {
            if (library.get(i).getId() == id) {
                int data;
                String data1, data2;
                int data3;
                Scanner scan = new Scanner(System.in);
                System.out.println(" What information do you want to update " + "\n" + " 1 Title, 2 Author, 3 Id, 4 year , 5 Language, 6 publisher");
                data = scan.nextInt();

                switch (data) {
                    case 1:
                        System.out.println(" What is the new information? " + "\n");
                        data1 = sc.next();
                        library.get(i).setTitle(data1);
                        break;

                    case 2:
                        System.out.println(" What is the new information? " + "\n");
                        data2 = sc.next();
                        library.get(i).setAuthor(data2);
                        break;

                    case 3:

                        System.out.println(" What is the new information? " + "\n");
                        data3 = sc.nextInt();

                        library.get(i).setId(data3);
                        break;

                    case 4:
                        System.out.println(" What is the new information? " + "\n");
                        data3 = sc.nextInt();
                        library.get(i).setYear(data3);

                        break;

                    case 5:
                        System.out.println(" What is the new information? " + "\n");
                        data2 = sc.next();
                        library.get(i).setLang(data2);

                        break;

                    case 6:
                        System.out.println(" What is the new information? " + "\n");
                        data2 = sc.next();
                        library.get(i).setPublisher(data2);

                        break;
                }

            } else {
                cont++;
            }
        }
        if (cont==library.size()){
            System.out.println("Can not find the ID " +"\n");
        }
        return library;
    }

}
