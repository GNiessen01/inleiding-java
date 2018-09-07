package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.fillRect(100, 75, 100, 200);
        g.setColor(Color.red);
        g.fillArc(125, 80, 50,50, 360,360);
        g.setColor(Color.orange);
        g.fillArc(125,140,50,50,360,360);
        g.setColor(Color.green);
        g.fillArc(125,200,50,50,360,360);
    }
}