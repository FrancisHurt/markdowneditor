package markdowneditor;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{



    public View(){

        Editor editor = new Editor();
        editor.editorStart();

    }

    public static void main(String args[]) {
        View gui = new View();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200, 200);
        gui.setVisible(true);
        gui.setTitle("Frank's Markdown Editor");
    }
}
