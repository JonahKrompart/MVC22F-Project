package mvc22f;
//imports
import javax.swing.*;
import java.awt.*;

public final class Frame extends JFrame{
    private final Model model;

    //Throws exception if Keyboard/Mouse can't access the program
    public Frame(Model model) throws HeadlessException{
        this.model = model;
        System.out.println("Frame constructor: model = " + model);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setTitle("PENIS");
        setVisible(true);
    }
}