package com.example.springbootdemo;

public class LambdaDemo {

    final static String salutation = "Hello! ";
    static String salutation1="hi";
    public static void main(String[] args) {
           LambdaDemo demo=new LambdaDemo();


           MathOperation addition =(int a,int b) -> a+b;

           MathOperation subtraction=(int a,int b) -> a-b;

           MathOperation multiplication=(int a,int b) -> a*b;

           MathOperation division =(int a,int b) -> {return a/b;};

            System.out.println("5 + 5 ="+demo.operation(5,5,addition));
            System.out.println("5 - 5 ="+demo.operation(5,5,subtraction));
            System.out.println("5 * 5 ="+demo.operation(5,5,multiplication));
            System.out.println("5 / 5 ="+demo.operation(5,5,division));

            GreetingService service=message -> System.out.println(salutation + message);

            GreetingService service1=(message) -> {salutation1="hi! Who is "; System.out.println(salutation1 + message +"?");};

            service.sayMessage("Jack");

            service1.sayMessage("Marry");
            salutation1="######";

    }




    interface MathOperation{
        int operation(int a,int b);
    };

    interface  GreetingService{
        void sayMessage(String message);
    }

    private int operation(int a,int b,MathOperation operation){

        return operation.operation(a,b);
    }
}
