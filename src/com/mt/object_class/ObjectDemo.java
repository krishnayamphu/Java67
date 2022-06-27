package com.mt.object_class;
class B{
    public void test(){
        System.out.println("testing something");
    }

    public B getB(){
        return this;
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Object obj=new B().getB();


       ((B) obj).test();
    }
}
