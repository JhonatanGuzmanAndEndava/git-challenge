package Control;

import Backend.Book;
import Backend.StorageController;
import View.Window;

import javax.swing.*;
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

        this.window.getReadComboBox().addActionListener(this);
        this.window.getUpdateComboBox().addActionListener(this);

        this.storageController.loadDatabase();

        this.window.getReadComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
        this.window.getDeleteComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
        this.window.getUpdateComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
    }

    public void actionPerformed(ActionEvent e) {

        Object pushButton = e.getSource();

        // Create save button
        if(pushButton==window.getBtnSave()) {
            System.out.println("SAVE BOOK IN DATA FILE");

            String name = this.window.getTfName().getText();
            String author = this.window.getTfAuthor().getText();
            String isbn = this.window.getTfIsbn().getText();
            String published = this.window.getTfPublished().getText();
            String language = this.window.getTfLanguage().getText();
            String publisher = this.window.getTfPublisher().getText();

            this.storageController.createBook(name,author,isbn,published,language,publisher);
            reload();
        }

        if(pushButton==window.getUpdateComboBox()) {
            Book tmp = (Book) window.getUpdateComboBox().getSelectedItem();

            this.window.getTfId_update().setText(String.valueOf(tmp.getId()));
            this.window.getTfName_update().setText(tmp.getName());
            this.window.getTfAuthor_update().setText(tmp.getAuthor());
            this.window.getTfIsbn_update().setText(tmp.getIsbn());
            this.window.getTfPublished_update().setText(tmp.getPublished());
            this.window.getTfLanguage_update().setText(tmp.getLanguage());
            this.window.getTfPublisher_update().setText(tmp.getPublisher());
        }

        if(pushButton==window.getBtnUpdate()) {
            Book tmp = (Book) window.getUpdateComboBox().getSelectedItem();

            String name = this.window.getTfName_update().getText();
            String author = this.window.getTfAuthor_update().getText();
            String isbn = this.window.getTfIsbn_update().getText();
            String published = this.window.getTfPublished_update().getText();
            String language = this.window.getTfLanguage_update().getText();
            String publisher = this.window.getTfPublisher_update().getText();

            this.storageController.updateBook(tmp.getId(),name,author,isbn,published,language,publisher);
            reload();
        }

        if(pushButton==window.getBtnDelete()) {
            int i = window.getDeleteComboBox().getSelectedIndex();
            if(i>-1)
                this.storageController.deleteBook(i);
            reload();
        }

        if(pushButton==window.getReadComboBox()) {
            Book tmp = (Book) window.getReadComboBox().getSelectedItem();

            this.window.getJlblId().setText(String.valueOf(tmp.getId()));
            this.window.getJlblName().setText(tmp.getName());
            this.window.getJlblAuthor().setText(tmp.getAuthor());
            this.window.getJlblIsbn().setText(tmp.getIsbn());
            this.window.getJlblPublished().setText(tmp.getPublished());
            this.window.getJlblLanguage().setText(tmp.getLanguage());
            this.window.getJlblPublisher().setText(tmp.getPublisher());
        }
    }

    private void reload() {
        this.window.getReadComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
        this.window.getDeleteComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
        this.window.getUpdateComboBox().setModel(new DefaultComboBoxModel(this.storageController.getAllBooks().toArray()));
    }

}
