import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GenderSelection extends JFrame implements ActionListener {
    JRadioButton maleButton, femaleButton;
    JButton b1, b2;  
    JLabel resultLabel;
public GenderSelection() {
 setLayout(new FlowLayout());
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
       add(maleButton);
        add(femaleButton);
  b1 = new JButton("Submit");
        add(b1);
 b2 = new JButton("Reset");
        add(b2);
resultLabel = new JLabel("Selected Gender: None");
        add(resultLabel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        setTitle("Gender Selection");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (maleButton.isSelected()) {
                resultLabel.setText("Selected Gender: Male");
            } else if (femaleButton.isSelected()) {
                resultLabel.setText("Selected Gender: Female");
            } else {
                resultLabel.setText("Selected Gender: None");
            }
        } else if (e.getSource() == b2) {
            maleButton.setSelected(false);
            femaleButton.setSelected(false);
            resultLabel.setText("Selected Gender: None");
        }
    } public static void main(String[] args) {
        new GenderSelection();
    }
}
