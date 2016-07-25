package com.openknowl.tutorials;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> accountList = new ArrayList<>();
        accountList.add("000");
        accountList.add("001");
        accountList.add("002");
        accountList.add("003");
        accountList.add("004");
        accountList.add("005");
        accountList.add("006");
        accountList.add("007");
        accountList.add("008");
        accountList.add("009");

        // 리스트의 사이즈를 구하는 함수
        System.out.println(accountList.size());
        // 리스트가 비어있는지 검사하는 함수.
        System.out.println(accountList.isEmpty());
        // 0번째 인덱스에 있는 계좌를 삭제하는 함수
        System.out.println(accountList.remove(0));

        System.out.println("=======");
        System.out.println("for 문");
        for (int i = 0; i < accountList.size(); i++) {
            String account = accountList.get(i);
            System.out.println(account);
        }

        System.out.println("for-each 문");
        for (String account : accountList) {
            System.out.println(account);
        }

        System.out.println("lambda(java8)");
        accountList.forEach((account) -> {
            System.out.println(account);
        });

        System.out.println("==== clear ====");
        accountList.clear();
        for (String account : accountList) {
            System.out.println(account);
        }
    }
}
