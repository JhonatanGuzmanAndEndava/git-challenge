package Control;

import Backend.StorageController;
import View.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Window window;
    private StorageController storageController;

    public Controller(Window window, StorageController storageController) {
        this.window = window;
        this.storageController = storageController;

        this.window.getBtnSave().addActionListener(this);
        this.window.getBtnUpdate().addActionListener(this);
        this.window.getBtnDelete().addActionListener(this);

        this.storageController.loadDatabase();
    }

    public void actionPerformed(ActionEvent e) {

        Object pushButton = e.getSource();

        // Create save button
        if(pushButton==window.getBtnSave()) {
            System.out.println("SAVE BOOK IN DATA FILE");

            String name = this.window.getTfName().getText();
            String author = this.window.getTfAuthor().getText();;
            String isbn = this.window.getTfIsbn().getText();;
            String published = this.window.getTfPublished().getText();;
            String language = this.window.getTfLanguage().getText();;
            String publisher = this.window.getTfPublisher().getText();;

            this.storageController.createBook(name,author,isbn,published,language,publisher);

        }

        if(pushButton==window.getBtnUpdate()) {
            //TODO
        }

        if(pushButton==window.getBtnDelete()) {
            //TODO
        }
    }
}
