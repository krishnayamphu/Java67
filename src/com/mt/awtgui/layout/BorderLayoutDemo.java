package com.mt.awtgui.layout;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    Button btn1,btn2,btn3,btn4,btn5;
    BorderLayout bl;
    public BorderLayoutDemo(){
        btn1=new Button("Button 1");
        btn2=new Button("Button 2");
        btn3=new Button("Button 3");
        btn4=new Button("Button 4");
        btn5=new Button("Button 5");

        bl=new BorderLayout();
        setSize(600,400);
        setLayout(bl);

        setTitle("Frame");
        setVisible(true);

        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
