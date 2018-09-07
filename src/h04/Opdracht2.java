package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawLine(50, 350, 350, 350);
            g.drawLine(200, 50, 50, 350 );
            g.drawLine(200, 50, 350, 350 );

        }
    }

