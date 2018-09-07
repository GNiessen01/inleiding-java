package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht501 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 100;
        hoogte = 50;
    }

    public void paint(Graphics g) {
        g.drawRect(50, 50, breedte, hoogte);
        g.drawRoundRect(50,135,breedte,hoogte,30,30);
        g.setColor(opvulkleur);
        g.fillRect(175,50,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(175,50,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillOval(175,135,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawArc(300,125,75,75,360,360);
        g.drawOval(300,50,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(300,50,100,50,0,60);
        g.setColor(lijnkleur);
        g.drawString("Rechthoek",65,115);
        g.drawString("Afgeronde Rechthoek",50,200);
        g.drawString("Gevulde rechthoek met Ovaal",160,115);
        g.drawString("Gevulde Ovaal",180,200);
        g.drawString("Taartpunt met Ovaal",325,115);
        g.drawString("Cirkel",320,225);
    }
}
