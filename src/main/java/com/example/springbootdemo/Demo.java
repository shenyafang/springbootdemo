package com.example.springbootdemo;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
       FunctionInterfaceDemo demo=(y) -> {System.out.println("请输出这个数字："+y);};
       demo.function(4);


       TestConverT<String,Integer> t=Integer::valueOf;

       Integer i= t.converT("1111");
       System.out.println(i);
       System.out.println(String.valueOf("22222"));

         TestConverT<Integer,String> t1=String::valueOf;

         String ss=t1.converT(111);
         System.out.println(ss);


         UserFactory uf=User::new;
         uf.get("张三","男");

         System.out.println(uf.toString());




    }
}
