package Factorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FactorialNumber extends JFrame implements ActionListener{
    JTextField text_Field, result_Field;
    JLabel label, result_Label;
    JButton factButton;

    public FactorialNumber() {
        setLayout(null);

        label = new JLabel("Enter number:");
        text_Field = new JTextField();
        result_Label = new JLabel("Factorial:");
        result_Field = new JTextField();
        result_Field.setEditable(false);
        factButton = new JButton("Find Factorial");

        label.setBounds(30, 30, 100, 30);
        text_Field.setBounds(150, 30, 200, 30);
        factButton.setBounds(150, 80, 200, 30);
        result_Label.setBounds(30, 130, 120, 30);
        result_Field.setBounds(160, 130, 190, 30);

        add(label);
        add(text_Field);
        add(factButton);
        add(result_Label);
        add(result_Field);

        factButton.addActionListener(this);
        text_Field.addActionListener(this);

        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(text_Field.getText());
            if (number < 0) {
                result_Field.setText("Invalid Input");
                return;
            }
            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            result_Field.setText(String.valueOf(fact));
        } catch (NumberFormatException ex) {
            result_Field.setText("Invalid Input");
        }
    }


}


