package com.mt.awtgui.layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NoteEditor extends Frame {
    Button btnnew,btnsave,btnclear;
    TextArea ta;
    Panel pnltop;
    public NoteEditor(){
        btnnew=new Button("New");
        btnsave=new Button("Save");
        btnclear=new Button("Clear");
        ta=new TextArea();
        pnltop=new Panel();

        setVisible(true);
        setSize(600,400);
        setLayout(new BorderLayout());

        pnltop.setBackground(Color.cyan);
        pnltop.setLayout(new FlowLayout());
        pnltop.add(btnnew);
        pnltop.add(btnsave);
        pnltop.add(btnclear);
        add(pnltop,BorderLayout.NORTH);

        add(ta,BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new NoteEditor();
    }
}
