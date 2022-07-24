package com.mt.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> colors=new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");

        Iterator itr=colors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("============");
        colors.add(0,"blue");

        for(String s:colors){
            System.out.println(s);
        }
    }
}
