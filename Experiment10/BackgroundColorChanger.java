import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChanger {
    public static void main(String[] args){
        JFrame frame = new JFrame("Background Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        String[] colors = {"White", "Red", "Green", "Blue", "Yellow", "Gray"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        panel.add(new JLabel("Choose Background Color:"));
        panel.add(colorComboBox);
        frame.add(panel);
        colorComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedColor = (String) e.getItem();
                    switch (selectedColor) {
                        case "Red":
                            panel.setBackground(Color.RED);
                            break;
                        case "Green":
                            panel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            panel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            panel.setBackground(Color.YELLOW);
                            break;
                        case "Gray":
                            panel.setBackground(Color.GRAY);
                            break;
                        default:
                            panel.setBackground(Color.WHITE);
                    }
                }
            }
        });
        panel.setBackground(Color.WHITE);
        frame.setVisible(true);
    }
}
