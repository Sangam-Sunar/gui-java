package square;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator2 extends JFrame implements ActionListener{
    JTextField t1 , t2;
    JLabel l1,l2;
    JButton b1;
    int result;
    public calculator2() {
        this.setLayout(null);
        this.setSize(500, 600);
        l1 = new JLabel("Enter number");
        l1.setBounds(10, 10, 100, 30);
        this.add(l1);
        t1 = new JTextField();
        t1.setBounds(10, 50, 100, 30);
        this.add(t1);
        l2 = new JLabel();
        l2.setBounds(10, 100, 100, 30);
        this.add(l2);
        b1 = new JButton("square");
        b1.setBounds(10, 150, 100, 30);
        this.add(b1);
        b1.addActionListener(this);
        t2 = new JTextField();
        t2.setBounds(10, 200, 100, 30);
        this.add(t2);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        if (e.getSource() == b1) {
            result = num * num;

        }
        t2.setText(String.valueOf(result));

    }
}

