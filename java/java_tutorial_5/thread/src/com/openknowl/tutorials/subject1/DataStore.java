package com.openknowl.tutorials.subject1;

public class DataStore {
    private static int BALANCE = 30000;

    public static void withdraw(int money) {
        while (DataStore.BALANCE - money > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            int balance = DataStore.BALANCE;
            DataStore.BALANCE = balance - money;
        }
    }

    public static int getBalance() {
        return BALANCE;
    }
}
