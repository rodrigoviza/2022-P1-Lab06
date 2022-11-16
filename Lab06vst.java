// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Lab06vst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);


        // Draw Random Lines
        Random rand = new Random(12345);
        for (int a = 1; a<100; a++){
            int x1 = rand.nextInt(380)+10;
            int y1 = rand.nextInt(280)+10;
            int x2 = rand.nextInt(390)+10;
            int y2 = rand.nextInt(290)+10;
            int red = rand.nextInt(250);
            int blue = rand.nextInt(250);
            int green = rand.nextInt(250);
            g.setColor(new Color(red, blue,green));
            g.drawLine(x1,y1,x2,y2);
        }


        // Draw Random Squares
        for (int a = 1; a<100; a++) {
            int x = rand.nextInt(340)+400;
            int y = rand.nextInt(240)+10;
            int red = rand.nextInt(250);
            int blue = rand.nextInt(250);
            int green = rand.nextInt(250);
            g.setColor(new Color(red, blue, green));
            g.fillRect(x, y, 50, 50);
        }


        // Draw Random Circles
        for (int b = 1; b<100; b++) {
            int w = rand.nextInt(200);
            int x = rand.nextInt(391-w)+10;
            int y = rand.nextInt(280-w)+300;
            int red = rand.nextInt(250);
            int blue = rand.nextInt(250);
            int green = rand.nextInt(250);
            g.setColor(new Color(red, blue, green));
            g.drawOval(x, y, w, w);
        }


        // Draw 3-D Bo
        g.fillRect(550,350,100,100);
        g.fillRect(600,400,100,100);
        Polygon penta = new Polygon();
        penta.addPoint(550,350);
        penta.addPoint(600,400);
        penta.addPoint(600,500);
        penta.addPoint(550,450);
        int red = rand.nextInt(250);
        int blue = rand.nextInt(250);
        int green = rand.nextInt(250);
        g.setColor(new Color(red, blue, green));
        g.drawPolygon(penta);


    }
}