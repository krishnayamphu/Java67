package com.mt.awtgui.awtgraphics;

import java.awt.*;

public class DrawingApp extends Frame {
    Button btn;
    public DrawingApp(){
        btn=new Button("Button");
        setVisible(true);
        setSize(600,450);
        setLayout(new BorderLayout());

        add(btn,BorderLayout.NORTH);
        add(new MyCanvas(),BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new DrawingApp();
    }
}
