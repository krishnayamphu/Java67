package com.mt.stringhandling;

public class SgringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.append(" World"));

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(30);
        System.out.println(sb.capacity());
    }
}
