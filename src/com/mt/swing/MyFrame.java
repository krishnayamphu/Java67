package com.mt.swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton btn;
    public MyFrame(){
        btn=new JButton("Button");
        setSize(600,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(btn);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
