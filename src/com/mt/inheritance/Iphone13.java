package com.mt.inheritance;
class Apple{
    String brand;
}
class Mobile extends Apple{
    String model;
}
public class Iphone13 extends Mobile {
    public static void main(String[] args) {
        Iphone13 iphone=new Iphone13();
        iphone.brand="Apple";
        iphone.model="iphoneMaxPro-13";

        System.out.println("Company/Brand:"+iphone.brand);
        System.out.println("Model: "+iphone.model);
    }
}
