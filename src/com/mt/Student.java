package com.mt;

public class Student {
    String stdname;
    int stdroll;
    static String sclname="Aptech";

    public static void main(String[] args) {
    Student s1=new Student();
    s1.stdname="ram";
    s1.stdroll=1;

    Student s2=new Student();
    s2.stdname="sita";
    s2.stdroll=2;

        System.out.println("Name:"+s1.stdname);
        System.out.println("Rollno.: "+s1.stdroll);
        System.out.println("school: "+Student.sclname);

        System.out.println("Name:"+s2.stdname);
        System.out.println("Rollno.: "+s2.stdroll);
        System.out.println("school: "+Student.sclname);

    }
}
