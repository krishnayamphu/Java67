package com.mt.awtgui.awtgraphics;

import java.awt.*;

public class MyCanvas extends Canvas {
    int[] x={10,50,110};
    int[] y={200,100,200};
    public MyCanvas(){
        setSize(600,400);
        setBackground(Color.cyan);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
       g.fillRect(10,10,100,60);
        g.setColor(Color.blue);
       g.drawRect(120,10,100,60);

       g.setColor(Color.red);
       g.fillOval(230,10,100,100);
       g.drawArc(10,110,100,100,0, 255);

       g.drawPolygon(x,y,3);
    }
}
