package com.example.springbootdemo;


import javax.swing.*;

//方法引用
public class MethodReferenceDemo {

    public static void main(String[] args) {

        //如果你想传递到其他代码的动作已经存在，直接引用就能实现你想达成的效果，你可以考虑方法引用

         //如你想将一个integer转换为string时，你可以

          Method method=integer -> String.valueOf(integer);
          String ss=method.parse(111);

          System.out.println(ss);

          //你也可以这样写,相当于将String类的valueOf方法，转换为lambda函数，复制于Method接口
        Method method1=String::valueOf;
        String ss1=method1.parse(222);

        System.out.println(ss1);



    }
}


interface Method{

    String parse(Integer integer);
}

