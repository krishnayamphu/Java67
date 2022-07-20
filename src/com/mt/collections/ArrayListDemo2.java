package com.mt.collections;

import java.util.ArrayList;

class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Person> personsList=new ArrayList<>();
        personsList.add(new Person("Ram",40));
        personsList.add(new Person("Sita",20));
        personsList.add(new Person("Mohan",35));
        for(Person p:personsList){
            System.out.println("Name:"+p.name);
            System.out.println("Age: "+p.age);
        }

    }
}
