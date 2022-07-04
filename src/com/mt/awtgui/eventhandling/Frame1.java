package com.mt.awtgui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends Frame {
    Button btnok;
    TextField txtbox;
    public Frame1(){
        btnok=new Button("Click");
        txtbox=new TextField(20);
        setVisible(true);
        setSize(400,200);
        setLayout(new FlowLayout());

        add(txtbox);
        add(btnok);
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=txtbox.getText();
                System.out.println(s);
                JOptionPane.showMessageDialog(null,s,"Message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Frame1();
    }
}
