package View;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class Window extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JPanel createPane;
    private JPanel readPane;
    private JPanel updatePane;
    private JPanel deletePane;
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenuItem mntmExit;
    private JMenu mnHelp;
    private JMenuItem mntmAbout;
    private JTabbedPane tabbedPane;
    private JTextField tfName;
    private JTextField tfAuthor;
    private JTextField tfIsbn;
    private JTextField tfPublished;
    private JTextField tfLanguage;
    private JTextField tfPublisher;
    private JLabel lblName;
    private JLabel lblAuthor;
    private JLabel lblIsbn;
    private JLabel lblPublished;
    private JLabel lblLanguage;
    private JLabel lblPublisher;
    private JLabel lblCreateANew;
    private JButton btnSave;
    private JLabel lblShow;
    private JLabel lblId_read;
    private JLabel lblName_read;
    private JLabel lblAuthor_read;
    private JLabel lblIsbn_read;
    private JLabel lblPublished_read;
    private JLabel lblLanguage_read;
    private JLabel lblPublisher_read;
    private JLabel jlblId;
    private JLabel jlblName;
    private JLabel jlblAuthor;
    private JLabel jlblIsbn;
    private JLabel jlblPublished;
    private JLabel jlblLanguage;
    private JLabel jlblPublisher;
    private JComboBox readComboBox;
    private JLabel lblUpdate;
    private JLabel lblId_update;
    private JLabel lblName_update;
    private JLabel lblAuthor_update;
    private JLabel lblIsbn_update;
    private JLabel lblPublished_update;
    private Component lblLanguage_update;
    private JLabel lblPublisher_update;
    private JTextField tfId_update;
    private JTextField tfName_update;
    private JTextField tfAuthor_update;
    private JTextField tfIsbn_update;
    private JTextField tfPublished_update;
    private JTextField tfLanguage_update;
    private JTextField tfPublisher_update;
    private JComboBox updateComboBox;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JComboBox deleteComboBox;
    private JLabel lblDelete;

    public Window()
    {
        this.setTitle("Endava Library");
        this.setResizable(false);
        this.setBounds(350,150,724,580);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        createPane = new JPanel();
        createPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        readPane = new JPanel();
        readPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        updatePane = new JPanel();
        updatePane.setBorder(new EmptyBorder(5, 5, 5, 5));

        deletePane = new JPanel();
        deletePane.setBorder(new EmptyBorder(5, 5, 5, 5));

        //Menu bar

        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1018, 21);
        setJMenuBar(menuBar);

        mnFile = new JMenu("File");
        menuBar.add(mnFile);

        mntmExit = new JMenuItem("Exit");
        mnFile.add(mntmExit);

        mnHelp = new JMenu("Help");
        menuBar.add(mnHelp);

        mntmAbout = new JMenuItem("About");
        mnHelp.add(mntmAbout);
        getContentPane().setLayout(new CardLayout(0, 0));
        createPane.setLayout(null);

        //Finish menu bar

        tabbedPane.addTab("Create", createPane);

        //items for Create Panel

        lblName = new JLabel("Name");
        lblName.setBounds(163, 129, 56, 16);
        createPane.add(lblName);

        lblAuthor = new JLabel("Author");
        lblAuthor.setBounds(163, 171, 56, 16);
        createPane.add(lblAuthor);

        lblIsbn = new JLabel("ISBN");
        lblIsbn.setBounds(163, 213, 56, 16);
        createPane.add(lblIsbn);

        lblPublished = new JLabel("Published");
        lblPublished.setBounds(163, 255, 56, 16);
        createPane.add(lblPublished);

        lblLanguage = new JLabel("Language");
        lblLanguage.setBounds(163, 297, 56, 16);
        createPane.add(lblLanguage);

        lblPublisher = new JLabel("Publisher");
        lblPublisher.setBounds(163, 339, 56, 16);
        createPane.add(lblPublisher);

        tfName = new JTextField();
        tfName.setBounds(268, 129, 257, 22);
        createPane.add(tfName);
        tfName.setColumns(10);

        tfAuthor = new JTextField();
        tfAuthor.setBounds(268, 171, 257, 22);
        createPane.add(tfAuthor);
        tfAuthor.setColumns(10);

        tfIsbn = new JTextField();
        tfIsbn.setBounds(268, 213, 257, 22);
        createPane.add(tfIsbn);
        tfIsbn.setColumns(10);

        tfPublished = new JTextField();
        tfPublished.setBounds(268, 255, 257, 22);
        createPane.add(tfPublished);
        tfPublished.setColumns(10);

        tfLanguage = new JTextField();
        tfLanguage.setBounds(268, 297, 257, 22);
        createPane.add(tfLanguage);
        tfLanguage.setColumns(10);

        tfPublisher = new JTextField();
        tfPublisher.setBounds(268, 339, 257, 22);
        createPane.add(tfPublisher);
        tfPublisher.setColumns(10);

        btnSave = new JButton("Save");
        btnSave.setBounds(279, 385, 97, 25);
        createPane.add(btnSave);

        lblCreateANew = new JLabel("Create a new book");
        lblCreateANew.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblCreateANew.setBounds(241, 23, 276, 52);
        createPane.add(lblCreateANew);

        tabbedPane.addTab("Read", readPane);
        readPane.setLayout(null);

        //items for read book

        lblShow = new JLabel("Show book");
        lblShow.setBounds(241, 23, 276, 52);
        lblShow.setFont(new Font("Tahoma", Font.BOLD, 24));
        readPane.add(lblShow);

        lblId_read = new JLabel("ID");
        lblId_read.setBounds(163, 132, 56, 16);
        readPane.add(lblId_read);

        lblName_read = new JLabel("Name");
        lblName_read.setBounds(163, 174, 56, 16);
        readPane.add(lblName_read);

        lblAuthor_read = new JLabel("Author");
        lblAuthor_read.setBounds(163, 216, 56, 16);
        readPane.add(lblAuthor_read);

        lblIsbn_read = new JLabel("ISBN");
        lblIsbn_read.setBounds(163, 258, 56, 16);
        readPane.add(lblIsbn_read);

        lblPublished_read = new JLabel("Published");
        lblPublished_read.setBounds(163, 300, 56, 16);
        readPane.add(lblPublished_read);

        lblLanguage_read = new JLabel("Language");
        lblLanguage_read.setBounds(163, 342, 56, 16);
        readPane.add(lblLanguage_read);

        lblPublisher_read = new JLabel("Publisher");
        lblPublisher_read.setBounds(163, 384, 56, 16);
        readPane.add(lblPublisher_read);

        jlblId = new JLabel("");
        jlblId.setBounds(268, 132, 257, 22);
        readPane.add(jlblId);

        jlblName = new JLabel("");
        jlblName.setBounds(268, 174, 257, 22);
        readPane.add(jlblName);

        jlblAuthor = new JLabel("");
        jlblAuthor.setBounds(268, 216, 257, 22);
        readPane.add(jlblAuthor);

        jlblIsbn = new JLabel("");
        jlblIsbn.setBounds(268, 258, 257, 22);
        readPane.add(jlblIsbn);

        jlblPublished = new JLabel("");
        jlblPublished.setBounds(268, 300, 257, 22);
        readPane.add(jlblPublished);

        jlblLanguage = new JLabel("");
        jlblLanguage.setBounds(268, 342, 257, 22);
        readPane.add(jlblLanguage);

        jlblPublisher = new JLabel("");
        jlblPublisher.setBounds(268, 384, 257, 22);
        readPane.add(jlblPublisher);

        readComboBox = new JComboBox();
        readComboBox.setBounds(163, 91, 362, 22);
        readPane.add(readComboBox);

        tabbedPane.addTab("Update", updatePane);
        updatePane.setLayout(null);

        //items for read book
        lblUpdate = new JLabel("Update book");
        lblUpdate.setBounds(241, 23, 276, 52);
        lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 24));
        updatePane.add(lblUpdate);

        lblId_update = new JLabel("ID");
        lblId_update.setBounds(163, 132, 56, 16);
        updatePane.add(lblId_update);

        lblName_update = new JLabel("Name");
        lblName_update.setBounds(163, 174, 56, 16);
        updatePane.add(lblName_update);

        lblAuthor_update = new JLabel("Author");
        lblAuthor_update.setBounds(163, 216, 56, 16);
        updatePane.add(lblAuthor_update);

        lblIsbn_update = new JLabel("ISBN");
        lblIsbn_update.setBounds(163, 258, 56, 16);
        updatePane.add(lblIsbn_update);

        lblPublished_update = new JLabel("Published");
        lblPublished_update.setBounds(163, 300, 56, 16);
        updatePane.add(lblPublished_update);

        lblLanguage_update = new JLabel("Language");
        lblLanguage_update.setBounds(163, 342, 56, 16);
        updatePane.add(lblLanguage_update);

        lblPublisher_update = new JLabel("Publisher");
        lblPublisher_update.setBounds(163, 384, 56, 16);
        updatePane.add(lblPublisher_update);

        tfId_update = new JTextField();
        tfId_update.setBounds(268, 129, 257, 22);
        updatePane.add(tfId_update);
        tfId_update.setColumns(10);

        tfName_update = new JTextField();
        tfName_update.setBounds(268, 171, 257, 22);
        updatePane.add(tfName_update);
        tfName_update.setColumns(10);

        tfAuthor_update = new JTextField();
        tfAuthor_update.setBounds(268, 213, 257, 22);
        updatePane.add(tfAuthor_update);
        tfAuthor_update.setColumns(10);

        tfIsbn_update = new JTextField();
        tfIsbn_update.setBounds(268, 255, 257, 22);
        updatePane.add(tfIsbn_update);
        tfIsbn_update.setColumns(10);

        tfPublished_update = new JTextField();
        tfPublished_update.setBounds(268, 297, 257, 22);
        updatePane.add(tfPublished_update);
        tfPublished_update.setColumns(10);

        tfLanguage_update = new JTextField();
        tfLanguage_update.setBounds(268, 339, 257, 22);
        updatePane.add(tfLanguage_update);
        tfLanguage_update.setColumns(10);

        tfPublisher_update= new JTextField();
        tfPublisher_update.setBounds(268, 381, 257, 22);
        updatePane.add(tfPublisher_update);
        tfPublisher_update.setColumns(10);

        updateComboBox = new JComboBox();
        updateComboBox.setBounds(163, 91, 362, 22);
        updatePane.add(updateComboBox);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(268, 425, 97, 25);
        updatePane.add(btnUpdate);

        tabbedPane.addTab("Delete", deletePane);
        deletePane.setLayout(null);

        lblDelete = new JLabel("Delete book");
        lblDelete.setBounds(241, 23, 276, 52);
        lblDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
        deletePane.add(lblDelete);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(287, 174, 97, 25);
        deletePane.add(btnDelete);

        deleteComboBox = new JComboBox();
        deleteComboBox.setBounds(163, 91, 362, 22);
        deletePane.add(deleteComboBox);

        getContentPane().add(tabbedPane, "name_430147323327930");

    }

    //Getters

    public JButton getBtnSave() {
        return btnSave;
    }
    public JTextField getTfAuthor() {
        return tfAuthor;
    }
    public JTextField getTfPublished() {
        return tfPublished;
    }
    public JTextField getTfLanguage() {
        return tfLanguage;
    }
    public JTextField getTfIsbn() {
        return tfIsbn;
    }
    public JTextField getTfName() {
        return tfName;
    }
    public JTextField getTfPublisher() {
        return tfPublisher;
    }
    public JComboBox getReadComboBox() {
        return readComboBox;
    }
    public JLabel getJlblName() {
        return jlblName;
    }
    public JLabel getJlblLanguage() {
        return jlblLanguage;
    }
    public JLabel getJlblAuthor() {
        return jlblAuthor;
    }
    public JLabel getJlblId() {
        return jlblId;
    }
    public JLabel getJlblPublisher() {
        return jlblPublisher;
    }
    public JLabel getJlblIsbn() {
        return jlblIsbn;
    }
    public JLabel getJlblPublished() {
        return jlblPublished;
    }
    public JComboBox getUpdateComboBox() {
        return updateComboBox;
    }
    public JTextField getTfIsbn_update() {
        return tfIsbn_update;
    }
    public JTextField getTfId_update() {
        return tfId_update;
    }
    public JTextField getTfPublished_update() {
        return tfPublished_update;
    }
    public JTextField getTfAuthor_update() {
        return tfAuthor_update;
    }
    public JTextField getTfName_update() {
        return tfName_update;
    }
    public JTextField getTfPublisher_update() {
        return tfPublisher_update;
    }
    public JButton getBtnUpdate() {
        return btnUpdate;
    }
    public JTextField getTfLanguage_update() {
        return tfLanguage_update;
    }
    public JButton getBtnDelete() {
        return btnDelete;
    }
    public JComboBox getDeleteComboBox() {
        return deleteComboBox;
    }
}
