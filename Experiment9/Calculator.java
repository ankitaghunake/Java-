import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    double num1, num2, result;
    String operator;

    public Calculator() {
        frame = new JFrame("Simple Calculator");
        textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);
        textField.setEditable(false);
        frame.add(textField);

        String[] buttonLabels = {
                "7", "8", "9", "/", "sqrt",
                "4", "5", "6", "*", "square",
                "1", "2", "3", "-", "cube",
                "0", ".", "=", "+", "%",
                "C"
        };

        JButton[] buttons = new JButton[buttonLabels.length];

        int x = 30, y = 100;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setBounds(x, y, 50, 40);
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);
            x += 60;
            if ((i + 1) % 5 == 0) {
                x = 30;
                y += 50;
            }
        }

        frame.setSize(350, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            if (command.matches("[0-9\\.]")) {
                textField.setText(textField.getText() + command);
            } else if (command.matches("[+\\-*/%]")) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            } else if (command.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num2 != 0 ? num1 / num2 : 0; break;
                    case "%": result = num1 % num2; break;
                }
                textField.setText(String.valueOf(result));
            } else if (command.equals("sqrt")) {
                double value = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(Math.sqrt(value)));
            } else if (command.equals("square")) {
                double value = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(value * value));
            } else if (command.equals("cube")) {
                double value = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(value * value * value));
            } else if (command.equals("C")) {
                textField.setText("");
                num1 = num2 = result = 0;
                operator = "";
            }
        } catch (Exception ex) {
            textField.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
