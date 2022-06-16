package com.mt.object_class;

public class Person {
    String name;
    public Person(){
        System.out.println("Person obj is created.");
    }

    public static void main(String[] args) {
        Person p=new Person();

        new Person();
    }
}
