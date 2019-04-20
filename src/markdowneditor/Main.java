package markdowneditor;

import markdowneditor.View;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void Main()
    {
        View view = new View();
        view.guiStart();
    }

    // call Swing code in a thread-safe manner per the tutorials
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Main();
            }
        });
    }
}
