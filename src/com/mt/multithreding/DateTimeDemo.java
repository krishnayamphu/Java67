package com.mt.multithreding;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        System.out.println("Day:"+date.getDayOfMonth());
        System.out.println("Month:"+date.getMonthValue());
        System.out.println("Year:"+date.getYear());
        System.out.println("\n=======================\n");

        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println("Hour:"+time.getHour());
        System.out.println("Minutes:"+time.getMinute());
        System.out.println("Seconds:"+time.getSecond());
        System.out.println("NonoSeconds:"+time.getNano());


    }
}
