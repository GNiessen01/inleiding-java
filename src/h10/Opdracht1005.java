package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1005 extends Applet {
    Double cijfer;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("typ hier je cijfers in en druk op enter");



        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer > 5.4) {
                tekst = "je hebt een voldoende";
                repaint();
            } else {
                tekst = "je hebt een onvoldoende";
            }
            repaint();

        }
    }

    class knopListner implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            tekst = ("");
            tekst = tekstvak.getText();
        }

    }
}
