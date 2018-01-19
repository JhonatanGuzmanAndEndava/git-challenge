package team1.front;

import java.util.Scanner;
import team1.back.logic.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;
        while(active){
            System.out.println("Bienvenido escoga que quiere hacer:\n" +
                    "1.Crear\n" +
                    "2.Leer\n" +
                    "3.Actualizar\n" +
                    "4.Eliminar\n" +
                    "5.Salir\n"
            );
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    create(sc);
                    break;
                case 2:
                    read(sc);
                    break;
                case 3:
                    updateBook(sc);
                    break;
                case 4:
                    delete(sc);
                    break;
                case 5:
                    active = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void create(Scanner sc){
        String id, name, author, ISBN, published, language, publisher;
        System.out.print("Introduce el id del Libro: ");
        id = sc.nextLine();
        System.out.print("Introduce el nombre del Libro: ");
        name = sc.nextLine();
        System.out.print("Introduce el nombre del Autor: ");
        author = sc.nextLine();
        System.out.print("Introduce el ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("Introduce la fecha de publicación(DD/MM/AAAA): ");
        published = sc.nextLine();
        System.out.print("Introduce el idioma: ");
        language = sc.nextLine();
        System.out.print("Introduce el editor: ");
        publisher = sc.nextLine();
        System.out.println();

        Book created = Book.createBook(Integer.parseInt(id), name, author, Integer.parseInt(ISBN),published,language,publisher);

        System.out.println("Libro agregado exitosamente a la base de datos");
        System.out.println("Libro: ");
        System.out.println("Id: " + created.getId());
        System.out.println("Titulo: " + created.getName());
        System.out.println("Autor: " + created.getAuthor());
        System.out.println("ISBN: " + created.getISBN());
        System.out.println("Fecha de publicacion: " + created.getPublished());
        System.out.println("Idioma: " + created.getLanguage());
        System.out.println("Editor: " + created.getPublisher());
        System.out.println();
    }


    public static void updateBook(Scanner sc) {
        String id, name, author, ISBN, published, language, publisher;
        System.out.print("Introduce el id del Libro a actualizar: ");
        id = sc.nextLine();
        System.out.print("Introduce el nombre del Libro: ");
        name = sc.nextLine();
        System.out.print("Introduce el nombre del Autor: ");
        author = sc.nextLine();
        System.out.print("Introduce el ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("Introduce la fecha de publicación(DD/MM/AAAA): ");
        published = sc.nextLine();
        System.out.print("Introduce el idioma: ");
        language = sc.nextLine();
        System.out.print("Introduce el editor: ");
        publisher = sc.nextLine();
        System.out.println();

        Book updatedBook = new Book(Integer.parseInt(id), name, author, Integer.parseInt(ISBN),published,language,publisher);
        Book updated = Book.updateBook(updatedBook);
        if (updated==null){
            System.out.print("Este libro no existe");
            System.out.println();
        }
    }

    public static void delete(Scanner sc) {
        String id;
        System.out.print("Introduce el id del Libro: ");
        id = sc.nextLine();
        Book deleted = Book.deleteBook(Integer.parseInt(id));
        if (deleted == null) {
            System.out.print("Este libro no existe");
            System.out.println();
        }
    }
    public static void read(Scanner sc) {
        String id;
        System.out.print("Introduce el id del Libro que quieres leer: ");
        id = sc.nextLine();
        Book read = Book.readBook(Integer.parseInt(id));

        if (read==null){
            System.out.print("Este libro no existe");
            System.out.println();
        }else {
            System.out.println("Libro: ");
            System.out.println("Id: " + read.getId());
            System.out.println("Titulo: " + read.getName());
            System.out.println("Autor: " + read.getAuthor());
            System.out.println("ISBN: " + read.getISBN());
            System.out.println("Fecha de publicacion: " + read.getPublished());
            System.out.println("Idioma: " + read.getLanguage());
            System.out.println("Editor: " + read.getPublisher());
            System.out.println();
        }
    }
}
