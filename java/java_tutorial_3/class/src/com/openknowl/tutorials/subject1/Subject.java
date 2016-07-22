package com.openknowl.tutorials.subject1;

import com.openknowl.tutorials.subject2.AccountController;

import java.util.Scanner;

public class Subject {
    /*
     * 계산기 과제
     * 해당 코드가 동작할 수 있도록 Calculator 클래스를 작성해볼 것
     */
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(50);
        myCalculator.add(20);
        System.out.println(myCalculator.getResult());
        myCalculator.subtraction(60);
        System.out.println(myCalculator.getResult());
        myCalculator.division(10);
        System.out.println(myCalculator.getResult());
        myCalculator.multiplication(2);
        System.out.println(myCalculator.getResult());
    }

}
