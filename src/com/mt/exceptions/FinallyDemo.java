package com.mt.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("program start");
            int x=10,y=0;
            System.out.println("Output:"+(x/y));
            System.out.println("hello world");
        }catch (ArithmeticException e){
            System.err.println(e);
        }finally {
            System.out.println("You reached finally block");
        }
    }
}
