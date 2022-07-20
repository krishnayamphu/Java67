package com.mt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Nepal");
        list.add("India");
        list.add("China");

        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============");
        list.remove("China");
        list.add("Japan");
        list.add(10);

        for(Object s:list){
            System.out.println(s);
        }

        System.out.println("===================");

        ArrayList<Integer> numlist=new ArrayList<>();
        numlist.add(10);
        numlist.add(20);
        numlist.add(40);
        numlist.add(25);

        for(Integer i:numlist){
            System.out.println(i);
        }

        System.out.println("Ascending order: ");
        Collections.sort(numlist);
        //Collections.reverse(numlist);
        for(Integer i:numlist)
        {
            System.out.println(i);
        }

    }
}
