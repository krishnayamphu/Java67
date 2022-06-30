package com.mt.exceptions;

import javax.swing.*;

public class Voter {
    public void checkAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            throw new ArithmeticException("under age: "+age);
        }
    }

    public static void main(String[] args) {
        Voter voter=new Voter();
        try{
            voter.checkAge(5);
        }catch (ArithmeticException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.WARNING_MESSAGE);
        }

    }
}
