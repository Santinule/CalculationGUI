import javax.swing.*;
import java.awt.*;
/**
 * This class creates a gui background that can be passsed JComponent objects.
 * The class sets a frame and then a rowsXcols GridLayout over a JPanel object.
 * It specifies a 5 for a horizontal and vertical gap.
 *
 */
public class Background {
    private JFrame frame;
    private JPanel panel;

    /**
     * Constructs a Background object with a specified title, width, and height.
     * Creates 4x3 grid GUI. Background wrapper of a Java Swing frame and
     * panel.
     *
     * @param title  The title of the frame.
     * @param width  The width of the frame.
     * @param height The height of the frame.
     */
    public Background(String title, int width, int height, int rows, int cols) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        //Set 4x3 grid
        panel = new JPanel(new GridLayout(rows, cols, 5, 5));
        frame.add(panel);
    }

    //Set attributes to the panel or frame
    public void setBackgroundColor(Color color) {
        panel.setBackground(color);
    }

    public void addComponent(JComponent component) {
        panel.add(component);
    }

    //Makes the frame visible to the gui
    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}//end Background
