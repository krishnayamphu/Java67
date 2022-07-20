package com.mt.multithreding;

public class MyThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("hello");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread());
        t1.start();
    }
}
