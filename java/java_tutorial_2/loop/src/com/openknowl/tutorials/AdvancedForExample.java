package com.openknowl.tutorials;

public class AdvancedForExample {
    public static void main(String[] args) {

        // 9 * 9
        int result;
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }

    }
}
