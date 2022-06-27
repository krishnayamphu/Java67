package com.mt.object_class;

public class TypeCastDemo {
    public static void main(String[] args) {
        double d=100.25d;
        int x;
        x=(int)d;  //typecast (downcast)//manual

        int y=5;
        double z=y; //typecast (upcasting) auto

        System.out.println(x);
        System.out.println(z);
    }
}
