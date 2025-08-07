package KeyEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends JFrame implements KeyListener {

    JLabel l;
    JTextArea area;

    KeyListenerExample() {
        l = new JLabel();
        l.setBounds(20,50,200,20);
        area = new JTextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");
        l.setText("Words: " + words.length + "characters: " + text.length());

    }
}