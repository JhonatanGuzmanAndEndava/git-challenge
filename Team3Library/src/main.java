
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Boolean.TRUE;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object;
import java.util.AbstractCollection;
import java.util.AbstractList;



public class main {

    static ArrayList<Book> library = new ArrayList<Book>();

    static String fileBd = System.getProperty("user.dir")+"/src/BD.txt";

    public static void main(String[] args) {
        loadfile();
        init();
    }

    public static void  loadfile(){
        File file = new File( fileBd );
        BufferedReader entrada;
        try {
            entrada = new BufferedReader( new FileReader( file ) );
            String linea;
            while(entrada.ready()){
                linea = entrada.readLine();
                String[] parts = linea.split(";");
                Book book = new Book();
                book.setId(Integer.parseInt(parts[0]));
                book.setTitle(parts[1]);
                book.setAuthor(parts[2]);
                book.setIsbn(parts[3]);
                book.setYear(Integer.parseInt(parts[4]));
                book.setLang(parts[5]);
                book.setPublisher(parts[6]);
                library.add(book);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  uploadfile()  {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileBd));
            bw.close();
            FileWriter fstream = new FileWriter(fileBd, true);
            BufferedWriter out = new BufferedWriter(fstream);
            for(Book s :library) {
                out.write(s.getId()+";"+s.getTitle()+";"+s.getAuthor()+";"+s.getIsbn()+";"+s.getYear()+";"+s.getLang()+";"+s.getPublisher());
                out.write("\n");
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  static  void init () {
        Scanner scan =  new Scanner(System.in);
        int res;
        System.out.println("Add a book : 1");
        System.out.println("Read a book: 2");
        System.out.println("Update a book: 3");
        System.out.println("Delete a book: 4");
        System.out.println("List book: 5");
        System.out.println("Exit: 6");
        res = scan.nextInt();
        Method method = new Method();
        switch (res){
            case 1:
                library = method.newBook(library);
                uploadfile();
                init();
                break;
            case 2:

                System.out.println("Search for id : 1");
                System.out.println("Search for title : 2");
                System.out.println("Search for author : 3");
                System.out.println("Search for isbn : 4");
                System.out.println("Search for year: 5");
                System.out.println("Search for lang: 6");
                System.out.println("Search for publisher: 7");
                int search = scan.nextInt();

                switch(search){
                    case 1:
                        System.out.println("Enter id");
                        int id = scan.nextInt();
                        method.printBook( method.searchBookId(id,library));
                        break;
                    case 2:
                        System.out.println("Enter title");
                        String title = scan.next();
                        method.printBook( method.searchBookTittle(title,library));
                        break;
                    case 3:
                        System.out.println("Enter author");
                        String author = scan.next();
                        method.printBook( method.searchBookAuthor(author,library));
                        break;
                    case 4:
                        System.out.println("Enter Isbn");
                        String isbn = scan.next();
                        method.printBook( method.searchBookIsbn(isbn,library));
                        break;
                    case 5:
                        System.out.println("Enter year");
                        int year = scan.nextInt();
                        method.printBook( method.searchBookYear(year,library));
                        break;
                    case 6:
                        System.out.println("Enter lang");
                        String lang = scan.next();
                        method.printBook( method.searchBookLang(lang,library));
                        break;
                    case 7:
                        System.out.println("Enter publisher");
                        String publisher = scan.next();
                        method.printBook( method.searchBookPublisher(publisher,library));
                        break;
                }
                init();
                break;
            case 3:
                library = method.updateBook(library);
                uploadfile();
                init();
                break;
            case 4:
                System.out.println("Delete for id : 1");
                System.out.println("Delete for title : 2");
                System.out.println("Delete for author : 3");
                System.out.println("Delete for isbn : 4");
                System.out.println("Delete for year: 5");
                System.out.println("Delete for lang: 6");
                System.out.println("Delete for publisher: 7");
                int delete = scan.nextInt();
 
                switch(delete){
                    case 1:
                        library = method.deleteBookId(library);
                        break;
                    case 2:
                        library = method.deleteBookTitle(library);
                        break;
                    case 3:
                        library = method.deleteBookAutor(library);
                        break;
                    case 4:
                        library = method.deleteBookIsbn(library);
                        break;
                    case 5:
                        library = method.deleteBookYear(library);
                        break;
                    case 6:
                        library = method.deleteBookLang(library);
                        break;
                    case 7:
                        library = method.deleteBookPublsher(library);
                        break;
                }
                uploadfile();
                init();
                break;
            case 5:
                method.printBook(library);
                init();
                break;
            case 6:
                System.out.println("Good Bye");
                break;
        }
    }










}
