package com.mt.inheritance;
class Bike{
    String brand;
    int maxSpeed;
}
class Honda extends Bike{
    String model;
}
class Hero extends Bike{
    String color;
}
public class HierarchicalDemo {
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.brand="Honda";
        honda.maxSpeed=200;
        honda.model="Hornet 160R";

        Hero hero=new Hero();
        hero.brand="Hero";
        hero.maxSpeed=180;
        hero.color="Red and White";

        System.out.println("Brand: "+honda.brand);
        System.out.println("Model: "+honda.model);
        System.out.println("Max Speed: "+honda.maxSpeed);

        System.out.println("Brand: "+hero.brand);
        System.out.println("Color: "+hero.color);
        System.out.println("Max Speed: "+hero.maxSpeed);
    }
}
