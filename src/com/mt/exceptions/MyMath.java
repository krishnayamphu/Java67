package com.mt.exceptions;

import javax.swing.*;

public class MyMath {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("Hello");
            int[] num=new int[2];
            num[0]=100;
            System.out.println(num[0]);
            System.out.println(num[1]);
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
//        catch (ArithmeticException e){
//            System.err.println("you can't divide number by zero.");
//            System.err.println(e);
//            JOptionPane.showMessageDialog(null,"you can't divide number by zero.","Error",JOptionPane.ERROR_MESSAGE);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println(e);
//        }

    }
}
