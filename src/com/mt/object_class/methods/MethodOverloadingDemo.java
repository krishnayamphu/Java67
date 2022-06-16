package com.mt.object_class.methods;

public class MethodOverloadingDemo {
    void sum(){
        System.out.println("Adding something");
    }
    void sum(int a, int b){
        System.out.println("Total sum: "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj=new MethodOverloadingDemo();
        obj.sum();
        obj.sum(10,5);
    }
}
