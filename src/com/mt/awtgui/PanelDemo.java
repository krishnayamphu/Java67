package com.mt.awtgui;

import java.awt.*;

public class PanelDemo extends Frame {
    private Panel p;
    Button btn;
    public PanelDemo(){
        p=new Panel();
        btn=new Button("Button");

        setVisible(true);
        setSize(400,300);
        add(p);
        p.setBackground(Color.CYAN);
        p.setLayout(new FlowLayout());
        p.add(btn);
    }

    public static void main(String[] args) {
        new PanelDemo();
    }
}
