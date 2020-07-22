package com.example.springbootdemo;

@FunctionalInterface
public interface FunctionInterfaceDemo {

    public void function(Integer integer);

    public default String function(String string){
        return string;
    };

    public default String function(String string,String string1){
        return string+string1;
    };

    public static void function(){
        System.out.println("##############");
    }

    public static String  function1(String string){
        System.out.println("##############"+string);
        return string;
    }
}
