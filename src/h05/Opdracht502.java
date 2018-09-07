package h05;

import java.awt.*;
import java.applet.*;

public class  Opdracht502 extends Applet {

    int hoogteValerie;
    int yValerie;

    public void init() {
        hoogteValerie = 50;
        yValerie = 300 - hoogteValerie;

        setSize(400,400);
    }


    public void paint(Graphics g) {
        g.drawLine(50, 50, 50,300);
        g.drawLine(50,300,300,300);
        g.drawLine(50,250,300,250);
        g.drawLine(50,200,300,200);
        g.drawLine(50,150,300,150);
        g.drawLine(50,100,300,100);
        g.setColor(Color.YELLOW);
        g.fillRect(60,yValerie,50,hoogteValerie);
    }
}