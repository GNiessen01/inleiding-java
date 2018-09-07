package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(100, 100, 150, 33);
        g.setColor(Color.white);
        g.fillRect(100, 125,150, 33);
        g.setColor(Color.blue);
        g.fillRect(100, 150, 150,25);
        g.setColor(Color.gray);
        g.fillRect(90, 100,10,100);
    }
}