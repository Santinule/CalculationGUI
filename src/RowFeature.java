import javax.swing.*;
import java.awt.*;

/**
 * This class represents a row feature in the calculator GUI.
 * Each row can be either a label with a text field or a button. Used to perform
 * and display a calculation.
 */
public class RowFeature {
    private JLabel label;
    private JTextField textField;
    private JButton jButton;
    private boolean isOutput;
    private boolean isButton;
    private Color color;

    /**
     * Constructor for creating a row feature with a label and text field.
     *
     * @param message  The label text for the row.
     * @param isOutput A boolean indicating if this row is meant for output display.
     */
    public RowFeature(String message, boolean isOutput) {
        this.label = new JLabel(message);
        this.textField = new JTextField();
        this.isOutput = isOutput;
        this.isButton = false;
        // If isOutput, then text field should not be editable
        if (isOutput) {
            textField.setEditable(false);
        }
    }

    /**
     * Constructor for creating a row feature with a button.
     *
     * @param buttonText The text on the button.
     * @param color      The background color of the button.
     */
    public RowFeature(String buttonText, Color color) {
        //new code
        this.jButton = new JButton(buttonText);
        this.color = color;
        this.isButton = true;
        this.jButton.setOpaque(true);

        this.jButton.setBorderPainted(false);
        this.jButton.setBackground(color);
    }
    /**
     * Adds three cells to a Background object designed for fitting a fixed
     * row of 1x2, and placing it in a grid.
     *
     * @param background The Background to which this RowFeature is to be added.
     */

    public void addToBackground(Background background) {
        if (!isButton) {
            label.setHorizontalAlignment(SwingConstants.CENTER); // Center the label
            background.addComponent(label);
            background.addComponent(textField);
        } else {
            background.addComponent(new JLabel(""));
            //Button in middle of two empty labels for alignment
            background.addComponent(jButton);
        }
    }

    // Getters
    public JTextField getTextField() {
        return textField;
    }

    public JButton getButton() {
        return jButton;
    }
}//end rowFeature
