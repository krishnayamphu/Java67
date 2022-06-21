package com.mt.inheritance;
final class Computer{
    void info(){
        System.out.println("showing computer info");
    }
}
public class Laptop{
    void info(){
        System.out.println("showing laptom info");
    }
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.info();
    }
}
