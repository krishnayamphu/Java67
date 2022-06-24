package com.mt.interfaces;

public class CannonPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("printing image");
    }

    public static void main(String[] args) {
        Printable printer=new CannonPrinter();
        printer.print();
        printer.test();
    }
}
