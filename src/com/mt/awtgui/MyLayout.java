package com.mt.awtgui;

import java.awt.*;

public class MyLayout extends Frame {
    Label lbltxt;
    Button btn;
    public MyLayout(){
        lbltxt=new Label("Hello World");
        btn=new Button("Button");
        setSize(600,400);
        setLayout(null);
        setTitle("Frame");
        setVisible(true);

        add(lbltxt);
        lbltxt.setBounds(50,100,100,30);
        add(btn);
        btn.setBounds(50,160,100,30);
    }

    public static void main(String[] args) {
        new MyLayout();
    }
}
