package h04;

import java.awt.*;
import java.applet.*;

public class OpdrachtPraktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(50,50,100,50);
        g.drawString("Rechthoek",70,115);
        g.drawLine(50,15,150,15);
        g.drawString("Lijn",90,30);
        g.drawRoundRect(50,135,100,50,15,15);
        g.drawString("Afgeronden Rechthoek",40,200);
        g.setColor(Color.magenta);
        g.fillArc(175,135,100,50,360,360);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",185,200);
        g.drawString("Gevulde Rechthoek met Ovaal", 160,115);
        g.drawArc(350,50,100,50,360,360);
        g.drawString("Taartpunt met Ovaal", 350,115);
        g.drawArc(350,135,75,75,360,360);
        g.drawString("Cirkel",375,225);
        g.setColor(Color.magenta);
        g.fillArc(350,50,100,50,0,60);
        g.fillRect(175,50,100,50);
        g.setColor(Color.black);
        g.drawArc(175,50,100,50,360,360);
    }
}