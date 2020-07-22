package com.example.springbootdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodDemo {


    public  static MethodDemo create(Supplier<MethodDemo> supplier){
      return  supplier.get();
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Jack");
        list.add("Marry");
        list.add("Able");
        list.add("Hank");

        list.forEach(System.out::println);

         MethodDemo demo=MethodDemo.create(MethodDemo::new);
         List<MethodDemo> demos= Arrays.asList(demo);
        demos.forEach(MethodDemo::collide);
       // demos.forEach(MethodDemo::repair);
    }



    public static void collide(MethodDemo demo){

        System.out.println("Collide" + demo.toString());
      }

      public void repair(){
        System.out.println("Repair" +this.toString());
      }
}
