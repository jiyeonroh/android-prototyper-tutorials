package com.openknowl.tutorials.subject1;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        while (DataStore.getBalance() > 0)
            DataStore.withdraw(1000);
    }
}
