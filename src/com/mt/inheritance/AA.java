package com.mt.inheritance;
class A{
   public int a;
}
public class AA extends A{
    public static void main(String[] args) {
        AA ob=new AA();
        ob.a=10;
        System.out.println(ob.a);
    }
}
