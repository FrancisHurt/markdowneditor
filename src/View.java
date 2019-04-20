package markdowneditor;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{

    public JLabel label;
    public JButton button;
    public JTextField textfield;

    public void guiStart() {
        // creating basic JFrame options
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200,200);
        setTitle("Markdown Editor");

        // setting up layou
        setLayout(new FlowLayout());

        // generating content
        label = new JLabel("What's up Label");
        textfield = new JTextField(15);
        button = new JButton("Button");

        // adding to JFrame
        add(label);
        add(textfield);
        add(button);
    }
}
