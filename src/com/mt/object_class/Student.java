package com.mt.object_class;

import java.util.Scanner;

public class Student {
    String name;
    String address;
    int age;

    public static void main(String[] args) {
        Student s=new Student();
        s.name="Ram";
        s.address="KTM";
        s.age=40;

        System.out.println(s.name);
        System.out.println(s.address);
        System.out.println(s.age);

        Student ss=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.print("Name:");
        ss.name=sc.next();
        System.out.println("Your name is: "+ss.name);
        System.out.print("Age:");
        ss.age=sc.nextInt();
        System.out.println("Your age is: "+ss.age);

    }
}
