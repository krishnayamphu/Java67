package com.mt.inheritance;

public class FinalDemo {
     final int maxspeed=180;

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();

        System.out.println(obj.maxspeed);
//        obj.maxspeed=300;
        System.out.println(obj.maxspeed);
    }
}
