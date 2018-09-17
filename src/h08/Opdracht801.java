package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht801 extends Applet {
    Button reset;
    Button OK;
    TextField tekstvak;
    Label label;

    public void init() {
        // OK-knop
        OK = new Button("OK");
        OK.addActionListener(new OKknopListener());
        add(OK);

        // Reset-knop
        reset = new Button("Reset");
        reset.addActionListener(new ResetknopListener());
        add(reset);

        tekstvak = new TextField("", 20);
        label = new Label("hallo");
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {

    }

    class OKknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            System.out.println("hhhh");
            label.setText("Hallo");
        }
    }

    class ResetknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hhhh");
            tekstvak.setText("");
        }
    }
}