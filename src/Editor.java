package markdowneditor;
import javax.swing.*;
import java.awt.*;

public class Editor extends JFrame{

    public void Editor(){

    }

    public void editorStart() {
        System.out.println("We entered the Editor function");

        // I think this is what was missing
        setLayout(new FlowLayout());

        // creating buttons and labels
        JLabel label;
        JButton button;
        JTextField textfield;

        // label
        label = new JLabel("What's up Label");
        add(label);

        /*
        // textfield
        textfield = new JTextField(15);
        add(textfield);

        // button
        button = new JButton("Button");
        add(button);

         */
    }
}
