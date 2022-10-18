package mvc22f;
//imports
import javax.swing.*;
import java.awt.*;

public final class View extends JPanel{
    private final Model model;

    public View(Model model){
        this.model = model;
        System.out.println("View constructor: view = " + model);
        setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
    }
}