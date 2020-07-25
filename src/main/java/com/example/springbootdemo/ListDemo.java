package com.example.springbootdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add(null);
        list.add("王五");

        for (String string:list
             ) {
            System.out.println(string);
        }

        System.out.println("#######################");
        Predicate predicate=e -> "张三".equals(e);

        //list去除满足条件的值
        list.removeIf(predicate);

        for (String string:list
        ) {
            System.out.println(string);
        }
    }
}
