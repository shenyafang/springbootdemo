package com.example.springbootdemo;

@FunctionalInterface
public interface TestConverT<T,F>{

   F converT(T t);
}
