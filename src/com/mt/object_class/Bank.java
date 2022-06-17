package com.mt.object_class;

public class Bank {
    public void bankName(){
        System.out.println("Bank: Sanima Bank");
    }
    public void getStaffDetails(String staffname){
        System.out.println("Staff Name: "+staffname);
        this.bankName();
    }

    public static void main(String[] args) {
        new Bank().getStaffDetails("Ram");
    }
}
