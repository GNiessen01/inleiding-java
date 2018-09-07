package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawLine(50, 50, 50,300);
            g.drawLine(50,300,300,300);
            g.drawLine(50,250,300,250);
            g.drawLine(50,200,300,200);
            g.drawLine(50,150,300,150);
            g.drawLine(50,100,300,100);
            g.setColor(Color.blue);
            g.fillRect(60,200,50,100);
            g.setColor(Color.red);
            g.fillRect(125,50,50,250);
            g.setColor(Color.yellow);
            g.fillRect(190,100,50,200);
            g.setColor(Color.blue);
            g.drawString("Valerie",60,320 );
            g.setColor(Color.red);
            g.drawString("Jeroen", 125, 320);
            g.setColor(Color.yellow);
            g.drawString("Hans", 190, 320);
        }
    }

