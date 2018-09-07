package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor(Color.white);
        g.fillRoundRect(100,100,150,150,50,50);
        g.setColor(Color.black);
        g.fillRoundRect(120,120,40,40,150,150);
        g.fillRoundRect(120,190,40,40,150,150);
        g.fillRoundRect(190,120,40,40,150,150);
        g.fillRoundRect(190,190,40,40,150,150);


    }
}