package com.mt.object_class.methods;

public class MethodDemo {
    public static void main(String[] args) {
        Math m=new Math(); //creating math obj.

        System.out.println(m.getMaxBikeSpeed());

        m.sum(10,5);
        m.sum(100,200);

        System.out.println("Discount amount:"+m.getDiscount(1000,10));
    }
}
