package com.mt.inheritance;
class Animal{
    public void eat(){
        System.out.println("eating some food");
    }
}
public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("dog eating some meat");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
    }
}
