package com.mt.object_class;

public class Demo {
    public int getMaxAge(){
        return 120;
    }
    public Demo getObject(){
        return this;
    }
    public void show(){
        int age=getObject().getMaxAge();
        System.out.println("Max age: "+age);
    }

    public static void main(String[] args) {
        new Demo().show();
    }
}
