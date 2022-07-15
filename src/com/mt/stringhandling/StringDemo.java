package com.mt.stringhandling;

public class StringDemo {
    public static void main(String[] args) {
        String s=new String("Welcome");
        String s1="hello";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s1.charAt(4));
        System.out.println(s.substring(0,3));
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.concat(" world"));
        System.out.println(s1.replace('h','w'));
        System.out.println(s1.replace("hello","hi"));

    }
}
