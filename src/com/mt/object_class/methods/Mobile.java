package com.mt.object_class.methods;

public class Mobile {
    String model;
    String brand;
    public void info(){
        System.out.println("showing info");
    }
    public void getMobile(Mobile m)
    {
        m.info();
    }
    public void show(){
        getMobile(this);
    }
    public static void main(String[] args) {
        new Mobile().show();
    }
}
