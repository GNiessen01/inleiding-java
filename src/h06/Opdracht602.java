package h06;

import java.applet.*;
import java.awt.*;

public class Opdracht602 extends Applet {
    int secPerMinuut, urenDag, secUur, secPerDag, dagJaar;
    double secPerUur;
    double secDag;
    double secPerJaar;

public void init () {
    secPerMinuut = 60;
    urenDag = 24;
    secPerUur = 3600;
    secPerDag = 86400;
    dagJaar = 365;
    secUur = 60 * secPerMinuut;
    secDag = urenDag * secUur;
    secPerJaar = 86400 * dagJaar;
}
public void paint (Graphics g) {
        g.drawString("In een minuut zitten 60 seconden", 20, 20);
        g.drawString("In 1 uur zitten 60 minuten, dus 60*60= " + secUur, 20, 40);
        g.drawString("In een dag zitten 24 uren, dus 3600*24= " + secPerDag,20,60);
        g.drawString("In 1 jaar zitten 365 dagen, dus 365*86400 " + secPerJaar,20,80);

    }
}

