import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Selector");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        String[] imageNames = {"apple.jpg", "banana.jpg", "grape.jpeg"};
        JComboBox<String> imageComboBox = new JComboBox<>(imageNames);
        frame.add(imageComboBox, BorderLayout.NORTH);
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(imageLabel, BorderLayout.CENTER);
        imageComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedImage = (String) imageComboBox.getSelectedItem();
                    ImageIcon icon = new ImageIcon(selectedImage); // Image file in the project directory
                    Image scaledImage = icon.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(scaledImage));
                }
            }
        });
        imageComboBox.setSelectedIndex(0); 
        frame.setVisible(true);
    }
}
