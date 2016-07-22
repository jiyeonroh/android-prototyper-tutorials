package com.openknowl.tutorials.subject2;

/**
 * MVC 모델에서 Model 영역의 dao 역할을 함.
 * 데이터베이스에 연결하고, 데이터를 조회, 수정, 삽입, 삭제하는 역할을 함 (CRUD)
 */
public class AccountRepository {

    public Account findById(String accountNumber) {
        return DataStore.findById(accountNumber);
    }

    public boolean update(String accountNumber, int money) {
        // your code..
        return false;
    }
}
