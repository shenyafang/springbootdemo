package com.example.springbootdemo;

import javafx.scene.Parent;

public class ChildDemo extends SuperDemo {

    public void green(){
          System.out.println("this is child class");


    }

    public static void staticgreen(){
        System.out.println("this is static method");


    }

    public static void oneParameterMethod(Integer integer){
        System.out.println("this is one parameter method,parameter is :"+integer);

    }

    public static void twoParameterMethod(Integer integer,String string){
        System.out.println("this is one parameter method,parameter is :"+integer+"and"+string);

    }



    public void supergreen(){


       Super1 super1= super::green;
       super1.method();
    }



    public void thisgreen(){

        Super1 super1= this::green;
        super1.method();
    }
}
