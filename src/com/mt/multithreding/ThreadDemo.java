package com.mt.multithreding;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.print("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

    }

    public static void main(String[] args) {
        new ThreadDemo().start();
    }
}
