package com.mt.awtgui;

import java.awt.*;

public class MyFrame extends Frame {
    Label lbltxt;
    Button btn;
    public MyFrame(){
        lbltxt=new Label("Hello World");
        btn=new Button("Button");

        setSize(600,400);
        setLayout(new FlowLayout());
        setTitle("Frame");
        setVisible(true);

        add(lbltxt);
        add(btn);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
