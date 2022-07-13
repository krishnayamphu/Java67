package com.mt.awtgui.awtgraphics;

import java.awt.*;

public class GraphicsDemo extends Frame {
    public GraphicsDemo(){
        setSize(400,300);
        setVisible(true);
        setTitle("Graphics Demo");
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }

    @Override
    public void paint(Graphics g) {
       g.fillRect(30,30,100,60);
    }
}
