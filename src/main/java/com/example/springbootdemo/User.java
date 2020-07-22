package com.example.springbootdemo;

public class User {
    private String name;
    private String sex;

    public User(String name, String sex) {
        super();
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}


