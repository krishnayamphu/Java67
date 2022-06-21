package com.mt.inheritance;
class Fruit{
    final void fruitInfo(){
        System.out.println("showing fruit info");
    }
}
public class Mango extends Fruit{
//    @Override
//    void fruitInfo(){
//        System.out.println("showing Mango info");
//    }

    public static void main(String[] args) {
        Mango mango=new Mango();
        mango.fruitInfo();
    }
}
