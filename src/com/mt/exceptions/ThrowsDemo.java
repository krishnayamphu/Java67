package com.mt.exceptions;

public class ThrowsDemo {
    public void calc(int n1, int n2) throws ArithmeticException{
        System.out.println("Output:"+(n1/n2));
    }

    public static void main(String[] args) {
        ThrowsDemo td=new ThrowsDemo();
        try{
            td.calc(10,0);
        }catch (ArithmeticException e){
            System.err.println(e);
        }

    }
}
