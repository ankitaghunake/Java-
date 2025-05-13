import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class color extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    public color() {
        b1 = new JButton("Red");
        b2 = new JButton("Green");
        b3 = new JButton("Blue");

        b1.setBounds(20, 20, 80, 30);
        b2.setBounds(120, 20, 80, 30);
        b3.setBounds(220, 20, 80, 30);

        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == b2) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == b3) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String args[]) {
        new color();
    }
}
