import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ReverseNumber extends JFrame implements ActionListener {
    JTextField t1, t2; 
    JButton reverseButton;

    public ReverseNumber() {
        setLayout(new FlowLayout());
JLabel inputLabel = new JLabel("Enter Number:");
        add(inputLabel);
t1 = new JTextField(10); 
        add(t1);
reverseButton = new JButton("Find Reverse");
        add(reverseButton);
 JLabel resultLabel = new JLabel("Reversed Number:");
        add(resultLabel);

        t2 = new JTextField(10); 
       add(t2);
 reverseButton.addActionListener(this);
setTitle("Reverse Number Finder");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        try {
        String input = t1.getText();
        String reversed = new StringBuilder(input).reverse().toString();
         t2.setText(reversed);
        } catch (Exception ex) {
            t2.setText("Invalid Input");
        }
    }
public static void main(String[] args) {
        new ReverseNumber();
    }
}
