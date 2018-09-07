package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {


    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawLine(50, 200, 50, 50);
        g.drawLine(50, 50, 200, 50);
        g.drawLine(50, 200,200,200 );
        g.drawLine(200, 50,200, 200);
        g.drawRect(60, 100, 40, 40);
        g.drawRect(140, 100,40, 100);
        g.drawLine(50,50, 125, 10);
        g.drawLine(200, 50,125,10);
    }
}

