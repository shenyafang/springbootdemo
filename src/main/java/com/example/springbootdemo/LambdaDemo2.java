package com.example.springbootdemo;

public class LambdaDemo2 {

    public static void main(String[] args) {
        happy(1000,
                m-> System.out.println("吃烤全羊消费"+m)
        );

        happy(1000,m->System.out.print("消费"+m));

        Consumer<Double> consumer=m->System.out.println("喝啤酒消费"+m);
        happy(500,consumer);

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("代码很复杂");
            }
        };


        Runnable runnable1=() -> System.out.println("代码很简单");



        runnable.run();
        runnable1.run();


    }


    //消费性接口
    public static void happy(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    interface Consumer<Double>{
        void accept(Double money);
    }




}
