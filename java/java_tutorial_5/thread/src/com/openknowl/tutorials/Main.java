package com.openknowl.tutorials;

public class Main {

    public static void main(String[] args) {
        new HelloThread().start();
        new Thread(new HelloRunnable()).start();
        new Thread(new WorkerThread()).start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " mainThread");
        }
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("Hello Thread !");
        }
    }

    static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello Runnable !");
        }
    }

    static class WorkerThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " worker");
            }
        }
    }
}
