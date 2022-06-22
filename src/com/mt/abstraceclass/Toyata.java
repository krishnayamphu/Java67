package com.mt.abstraceclass;
abstract class Car{
    Car(){
        System.out.println("Car object is created.");
    }
    abstract void drive();

}
public class Toyata extends Car{

    void drive(){
        System.out.println("Toyota Car is running");
    }
    public static void main(String[] args) {
        Car toyota=new Toyata();
        toyota.drive();
    }
}
