package com.mt.stringhandling;

public class StringBufferedDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello World");
        System.out.println(sb);
        System.out.println(sb.append(" how r u?").append( 10));
        System.out.println(sb.insert(5,'w'));

        StringBuffer bfr=new StringBuffer("Welcome");
        System.out.println(bfr.delete(3,7));

        StringBuffer buffer=new StringBuffer("programming");
        buffer.deleteCharAt(buffer.length()-1);
        System.out.println(buffer);
        buffer.deleteCharAt(buffer.length()-1);
        System.out.println(buffer);
        System.out.println(buffer.indexOf("m"));

        StringBuffer bb=new StringBuffer("hello");
        System.out.println(bb.length());
        System.out.println(bb.capacity());
    }
}
