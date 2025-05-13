import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class MouseCoordinatesGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Coordinates");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout())
        JLabel label = new JLabel("Move the mouse inside the window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(label, BorderLayout.SOUTH);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        frame.add(panel, BorderLayout.CENTER);
      panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Coordinates: X = " + e.getX() + ", Y = " + e.getY());
            }
        });
        // Show the frame
        frame.setVisible(true);
    }
}
