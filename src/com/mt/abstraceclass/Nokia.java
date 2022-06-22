package com.mt.abstraceclass;
abstract class Mobile{
    public abstract void deviceInfo();
}
public class Nokia extends Mobile{
    @Override
    public void deviceInfo() {
        System.out.println("Nokia Mobile");
    }

    public static void main(String[] args) {
        Nokia nokia=new Nokia();
        nokia.deviceInfo();
    }
}
