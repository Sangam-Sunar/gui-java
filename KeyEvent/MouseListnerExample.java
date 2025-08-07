package KeyEvent;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListnerExample extends JFrame implements MouseListener {

    JLabel l1,l2;
    MouseListnerExample() {
        addMouseListener(this);
        l1 = new JLabel();
        l2 = new JLabel();
        l1.setBounds(20,50,200,20);
        l2.setBounds(20,100,200,20);
        add(l1);
        add(l2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked"+"x:"+e.getX()+",y:"+e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("mouse Entered");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l2.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }
}


