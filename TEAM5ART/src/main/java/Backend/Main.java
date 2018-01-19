package Backend;

import java.awt.*;
import Control.Controller;
import View.Window;

public class Main {

    public static void main(String[] args) {

        Window frame = new Window();
        BookList.getInstance();
        StorageController storageController = new StorageController();

        Controller ct = new Controller(frame, storageController);


        frame.setVisible(true);

    }
}