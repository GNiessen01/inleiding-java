package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht803 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String schremtekst;
    Double getal;

public void init () {
    tekstvak = new TextField("", 30);
    label = new Label("Type hier");
    add(label);
    add(tekstvak);
    knop = new Button("OK");
    KnopListener k1 = new KnopListener();
    knop.addActionListener(k1);
    add(knop);
    schremtekst = "";
}
public void paint(Graphics g) {
    g.drawString("Bedrag inclusief btw " + getal,50,60);

}
 class KnopListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        getal = Double.parseDouble(tekstvak.getText())*1.21;
        repaint();
    }
 }
}