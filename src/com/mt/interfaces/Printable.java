package com.mt.interfaces;

public interface Printable {
    void print();
    default void test(){
        System.out.println("default test print method");
    }
}
