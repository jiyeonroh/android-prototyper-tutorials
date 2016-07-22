package com.openknowl.tutorials;

public class Duck {
    private int age;
    private String name;

    public void fly() {
        System.out.println(name + "이 날아올랐습니다.");
    }

    public void screaming() {
        System.out.println(name + "이 울었습니다.");
    }

    public Duck(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Duck() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
