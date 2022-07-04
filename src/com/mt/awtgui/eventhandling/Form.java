package com.mt.awtgui.eventhandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends Frame implements ActionListener {
    Button btnok,btnclose;
    public Form(){
        btnok=new Button("Click");
        btnclose=new Button("Close");

        setVisible(true);
        setSize(400,200);
        setLayout(new FlowLayout());

        add(btnok);
        btnok.addActionListener(this);

        add(btnclose);
        btnclose.addActionListener(this);
    }

    public static void main(String[] args) {
        new Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnok){
            System.out.println("hello");
        }
        if(e.getSource()==btnclose){
            System.exit(0);
        }
    }
}
