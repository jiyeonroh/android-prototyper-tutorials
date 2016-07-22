package com.openknowl.tutorials;

public class Main {

    public static void main(String[] args) {
        // 처음엔 접근지정자 public 을 통해서 보여주도록 시연할 것
        Duck duck = new Duck();
        duck.setAge(2);
        duck.setName("천둥오리");

        System.out.println(duck.getAge());
        System.out.println(duck.getName());

        duck.fly();
        duck.sound();

        // constructor
        Duck duck1 = new Duck(3, "미운오리");
        Duck duck2 = new Duck(2, "북경오리");
        Duck duck3 = new Duck(5, "가오리");
        Duck duck4 = new Duck(4, "나오리");

        System.out.println("duck1 = " + duck1.getAge() + " / " + duck1.getName());
        System.out.println("duck2 = " + duck2.getAge() + " / " + duck2.getName());
        System.out.println("duck3 = " + duck3.getAge() + " / " + duck3.getName());
        System.out.println("duck4 = " + duck4.getAge() + " / " + duck4.getName());

        // Null
        Duck nullDuck = null;
        System.out.println("nullDuck = " + nullDuck.getAge() + " / " + nullDuck.getName());
    }
}
