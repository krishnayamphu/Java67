package com.mt.object_class;

public class Bike {
    public Bike(){
        this("Honda");
        System.out.println("starting bike");
    }
    public Bike(String name){
        System.out.println(name+" bike is running.");
    }

    public static void main(String[] args) {
        new Bike("Honda");
    }
}
