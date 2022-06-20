package com.mt.inheritance;
class Vehicle{
    String name;
    String engineType;
    public Vehicle(String name, String engineType){
        this.name=name;
        this.engineType=engineType;
    }
}
public class Car extends Vehicle{
    int maxSpeed;
    public Car(String name,String engineType, int maxSpeed){
        super(name,engineType);
        this.maxSpeed=maxSpeed;
    }

    public static void main(String[] args) {
        Car car=new Car("Maruti Car","Petrol",200);

        System.out.println("Car name: "+car.name);
        System.out.println("Car engine type: "+car.engineType);
        System.out.println("Car max speed: "+car.maxSpeed);
    }
}
