package com.openknowl.tutorials.subject1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Subject {
    public static void main(String[] args) {
        /*
         * 다중 쓰레드 데이터 동기화 문제 처리
         *
         * 데이터가 왜 1000 이 아닌 -값이 출력될까 ?
         * 이유를 최대한 장황하게 서술해볼 것.
         *
         * 그리고 해결을 위한 코드를 삽입해보자.
         */
        Runnable worker = new WorkerThread();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();

        // Java8 Excutor.. 3초 후 실행되는 코드
        final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            System.out.println("결과는 " + DataStore.getBalance() + " 입니다.");
            executor.shutdown();
        }, 3, TimeUnit.SECONDS);
        executor.shutdown();
    }


}
