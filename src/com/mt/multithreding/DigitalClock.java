package com.mt.multithreding;

import javax.swing.*;
import java.time.LocalTime;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtclock;

    public DigitalClock() {
        txtclock = new JTextField(20);
        add(txtclock);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        Thread t=new Thread(new DigitalClock());
        t.start();
    }

    @Override
    public void run() {

        while (true) {
            try {
                LocalTime time = LocalTime.now();
                txtclock.setText(String.valueOf(time));
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
