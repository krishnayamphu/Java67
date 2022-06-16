package com.mt;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] num = new int[5];
        //int []num1=new int[5];
        //int num2[]=new int[5];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

        System.out.println("===============");
        for (int n : num) {
            System.out.println(n);
        }

    }
}
