import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Factorial extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b1;
    JTextField t1, t2;

    public Factorial() {
        setTitle("Factorial");

        l1 = new JLabel("Enter Number:");
        l2 = new JLabel("Factorial:");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t2.setEditable(false);

        b1 = new JButton("Click");

        setSize(400, 400);
        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());

        if (num < 0) {
            t2.setText("Invalid input");
            return;
        }

        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        t2.setText(String.valueOf(fact));
    }

    public static void main(String[] args) {
        new Factorial();
    }
}
