package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht601 extends Applet {
int a, b;
double uitkomst;

public void init () {
    a = 113;
    b = 4;
    uitkomst = (a/b);

}
public void paint (Graphics g) {
    g.drawString("113:4= " + uitkomst,20, 20);
    g.drawString("Jan krijgt " + uitkomst, 20,50);
    g.drawString("Ali krijgt " + uitkomst,20,65);
    g.drawString("Jeannette krijgt " + uitkomst, 20,80);
    g.drawString("Giovanni krijgt " + uitkomst, 20,95);


}
}
