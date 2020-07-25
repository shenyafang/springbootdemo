package com.example.springbootdemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {

    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        //Clock clock=Clock.
       LocalDate  ofDate= LocalDate.of(1998,02,28);
       LocalDate ofDate1=LocalDate.of(2002,Month.JULY,3);

      // CharSequence char=new CharSequence();

        LocalTime time=LocalTime.now();
        LocalTime time1= LocalTime.of(18,34);
        LocalTime time2=LocalTime.ofNanoOfDay(231);
       // LocalTime time3=LocalTime.
        System.out.println(date);
        System.out.println(ofDate);
        System.out.println(ofDate1);
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);



    }
}
