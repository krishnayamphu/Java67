package com.mt.object_class;

public class Abc {
    public static void main(String[] args) {
        University u=new University() {
            @Override
            public void getCollegeInfo() {
                System.out.println("College Name: Abc");
            }
        };
        u.getCollegeInfo();
    }
}
