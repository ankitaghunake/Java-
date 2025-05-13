import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Addition extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton b1;
    JTextField t1, t2, t3;

    public Addition() {
        setTitle("Addition of Two Numbers");

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t3.setEditable(false);

        b1 = new JButton("Add");

        setSize(400, 400);
        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = num1 + num2;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new Addition();
    }
}
