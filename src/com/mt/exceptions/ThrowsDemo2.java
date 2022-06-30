package com.mt.exceptions;

public class ThrowsDemo2 {
    public void calc(int n1, int n2) throws ArithmeticException{
        System.out.println("Output:"+(n1/n2));
    }

    public static void main(String[] args) throws ArithmeticException {
        ThrowsDemo2 td=new ThrowsDemo2();
        td.calc(10,0);
    }
}
