package mvc22f;
//imports
import javax.swing.*;
import java.awt.*;

public final class Controller extends JPanel {
    private final Model model;

    public Controller(Model model){
        this.model = model;
        System.out.println("Controller c-tor: model = " + model);
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
    }
}