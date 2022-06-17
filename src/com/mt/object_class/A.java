package com.mt.object_class;

public class A {
    int x,y;
    void sum(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        A ob=new A();
        ob.sum(5,10);
        System.out.println(ob.x);
    }
}
