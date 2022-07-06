package com.mt.awtgui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo  extends Frame{
    MenuBar mb;
    Menu mfile;
    MenuItem minew,miexit;
    public MenuBarDemo(){

        mb=new MenuBar();
        mfile=new Menu("File");
        minew=new MenuItem("New");
        miexit=new MenuItem("Exit");



        setVisible(true);
        setSize(600,400);
        setLayout(new BorderLayout());
        setMenuBar(mb);
        mb.add(mfile);
        mfile.add(minew);
        mfile.add(miexit);
        miexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
