package com.mt.object_class.methods;

public class Math {
    public int getMaxBikeSpeed(){
        return 200;
    }

    public void sum(int a, int b){
        int c=a+b;
        System.out.println("Total sum:"+c);
    }

    public double getDiscount(double price, double discountPercentage){
        double discount=0;
        discount=(price*discountPercentage)/100;
        return discount;
    }
}
