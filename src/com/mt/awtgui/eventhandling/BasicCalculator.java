package com.mt.awtgui.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BasicCalculator extends Frame {
    Label lbln1,lbln2,lblre;
    TextField txtn1,txtn2,txtre;
    Button btnp,btnm,btnmul,btndiv,btnc,btnexit;
    double n1,n2,re;

    public BasicCalculator(){
        lbln1=new Label("N1");
        lbln2=new Label("N2");
        lblre=new Label("RE");

        txtn1=new TextField(20);
        txtn2=new TextField(20);
        txtre=new TextField(20);

        btnp=new Button(" + ");
        btnm=new Button(" - ");
        btnc=new Button(" C ");

        setSize(300,200);
        setResizable(false);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Basic Calculator");

        add(lbln1);
        add(txtn1);

        add(lbln2);
        add(txtn2);

        add(lblre);
        add(txtre);

        add(btnp);
        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    n1=Double.parseDouble(txtn1.getText());
                    n2=Double.parseDouble(txtn2.getText());
                    re=n1+n2;
                    txtre.setText(String.valueOf(re));
                }catch (Exception ex){
                    System.err.println(ex);
                    JOptionPane.showMessageDialog(null,ex,"Error",1);
                }
            }
        });

        add(btnm);
        btnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    n1=Double.parseDouble(txtn1.getText());
                    n2=Double.parseDouble(txtn2.getText());
                    re=n1-n2;
                    txtre.setText(String.valueOf(re));
                }catch (Exception ex){
                    System.err.println(ex);
                    JOptionPane.showMessageDialog(null,ex,"Error",1);
                }
            }
        });

        add(btnc);
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtn1.setText("0");
                txtn2.setText("0");
                txtre.setText("");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new BasicCalculator();
    }

}
