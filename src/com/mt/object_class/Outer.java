package com.mt.object_class;

public class Outer {
    int o;
    class Inner{
        int i;
        int getI(){
            return i;
        }
        void setI(int i){
            this.i=i;
        }
    }

    public static void main(String[] args) {
        Outer outer =new Outer();
        outer.o=10;
        System.out.println(outer.o);

        Inner inner=outer.new Inner();
        inner.setI(5);
        System.out.println(inner.getI());
    }
}
