import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleTimerApp {
    private static int counter = 0;
    private static Timer timer;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Timer");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel timeLabel = new JLabel("Time: 0 seconds");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(timeLabel);
        JButton startButton = new JButton("Start");
        frame.add(startButton);
        JButton stopButton = new JButton("Stop");
        frame.add(stopButton);
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                timeLabel.setText("Time: " + counter + " seconds");
            }
        });
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        frame.setVisible(true);
    }
}
