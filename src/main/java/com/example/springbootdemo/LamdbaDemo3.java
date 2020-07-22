package com.example.springbootdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdbaDemo3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","fsa","ser","eere");


       Collections.sort(list);
        for (String string:list
             ) {
            System.out.println(string);
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String string:list
        ) {
            System.out.println(string);
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (String string:list
        ) {
            System.out.println(string);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        Collections.sort(list,(o1,o2)->o1.compareTo(o2));

        for (String string:list
        ) {
            System.out.println(string);
        }


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        Collections.sort(list,(o1,o2)-> {return o2.compareTo(o1);});

        for (String string:list
        ) {
            System.out.println(string);
        }
    }
}
