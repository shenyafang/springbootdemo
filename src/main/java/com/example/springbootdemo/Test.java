package com.example.springbootdemo;

import java.util.Timer;

public class Test {


    public static void main(String[] args) {

           ChildDemo demo=new ChildDemo();
           Super1 super1=demo::green;
           Super1 super11=demo::supergreen;
           Super1 super12=demo::thisgreen;
           Super1 super13=ChildDemo::staticgreen;
           Super2 super14=ChildDemo::oneParameterMethod;
           Super3 super3=ChildDemo::twoParameterMethod;
           Super2 super15=System.out::println;
           super15.method(333);


          super1.method();
          super11.method();
          super12.method();
          super13.method();
          super14.method(111);
          super3.method(111,"222");
    }


}


interface Super1{
     void method();
}


interface Super2{
    void method(Integer integer);
}

interface Super3{
    void method(Integer integer,String string);
}