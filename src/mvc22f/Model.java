package mvc22f;
import javax.swing.*;
import java.awt.*;
/*
Notes before reading:
1. SwingUtilities will be noted as "SU" bc that's some BS to type
2. JPanel is a part of SU
3. Inheritance is just fancy word for class hierarchy (you should know this though)
4. The "this" keyword means "deals with shit in this object" to prevent confusion with constructor calls
5. That wacky hex code shit at the end of model = things are memory addresses, this is useless info bc
it could literally not be true LOL you'll just say "model"

In the project instructions step 2.3 mentions this code here:
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run(){
        Model model = new Model();
        }
    });
    
This just requires an object to have a method called "run", which the only thing that
matters here is Model model = new Model();, SU.invokeLater just runs the GUI in a new thread,
that's right PUSSY you're writing a MULITHREADED PROGRAM but don't piss yourself yet, you'll be fine.
Then he gets into JPanels which is just the Java GUI builder stuff, it's not considered "thread safe"
but you won't be doing anything crazy enough to be pushing threads into instability.

I have spent a day trying to get any of this to show up in the webapp, and have looked over every instruction thoroughly.
This makes no sense!!!1!!1111!!!

It was fine the whole time, I just had to make the window, which I did.

Documentation on all the BS I talked about (surprisingly not hard to read, give these a look):
Documentation on "Runnable": https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
Documentation on "Swing Utilities": https://docs.oracle.com/javase/7/docs/api/javax/swing/SwingUtilities.html
Documentation on "JPanel": https://docs.oracle.com/javase/7/docs/api/javax/swing/JPanel.html
Documentation on "this": https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
 */

public final class Model{
    private final JPanel JPanel = new Title(); //TITLE
    private final Controller controller; //CONTROLLER
    private final View view; //VIEW
    private final Frame frame; //FRAME

    //Default values for GUI
    private Task task = Task.ELLIPSE;
    private int xSize = 66;
    private int ySize = 44;
    private Color color = Color.BLUE;
    private boolean solid = true;

    //Empty constructor full of things
    public Model(){
        System.out.println("Model constructor: this = " + this);
        controller = new Controller(this);
        view = new View(this);
        frame = new Frame(this);
        System.out.println("End Model constructor");
    }

    //Getters & Setters
    public JPanel title() {
        return JPanel;
    }
    public Controller controller() {
        return controller;
    }
    public View view() {
        return view;
    }
    public Frame frame() {
        return frame;
    }
    public Task task() {
        return task;
    }
    public Model setTask(Task task) {
        this.task = task;
        return this;
    }
    public int xSize() {
        return xSize;
    }
    public Model setxSize(int xSize) {
        this.xSize = xSize;
        return this;
    }
    public int ySize() {
        return ySize;
    }
    public Model setySize(int ySize) {
        this.ySize = ySize;
        return this;
    }
    public Color color() {
        return color;
    }
    public Model setColor(Color color) {
        this.color = color;
        return this;
    }
    public boolean solid() {
        return solid;
    }
    public Model setSolid(boolean solid) {
        this.solid = solid;
        return this;
    }

    //Main method
    public static void main(String[] args){
        System.out.println("Start MVC GUI Application main method");
        SwingUtilities.invokeLater(() -> { Model model = new Model(); });
        System.out.println("End MVC GUI Application main method");
    }
}