package com.mt.interfaces;

public class Circle implements Shape,Color{
    @Override
    public void draw() {
        System.out.println("drawing circle shape");
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();
        circle.fill();
    }

    @Override
    public void fill() {
        System.out.println("set shape fill color is red.");
    }
}
