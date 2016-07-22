package com.openknowl.tutorials.subject2;

/**
 * MVC 모델에서 Controller 역할을 함.
 * 요청을 받아, 요청의 흐름을 제어하고
 * 요청자(Client)에게 결과를 돌려주는 역할을 함
 */
public class AccountController {
    AccountRepository repository = new AccountRepository();

    /**
     * 인출
     *
     * @param accountNumber 인출할 계좌의 계좌번호
     * @param money         인출할 금액
     * @return 성공시 true 실패시 false
     */
    public boolean withdraw(String accountNumber, int money) {
        // your code..
        return false;
    }

    /**
     * 예금
     *
     * @param accountNumber 예금할 계좌의 계좌번호
     * @param money         예금할 금액
     * @return 성공시 true 실패시 false
     */
    public boolean deposit(String accountNumber, int money) {
        // your code..
        return false;
    }

    /**
     * 계좌이체
     *
     * @param senderAccountNumber   이체 금액 전송자
     * @param receiverAccountNumber 이체 금액 수령자
     * @param money                 이체 금액
     * @return 성공시 true 실패시 false
     */
    public boolean transfer(String senderAccountNumber, String receiverAccountNumber, int money) {
        // your code..
        return false;
    }

    /**
     * 예금 조회
     *
     * @param accountNumber 이체금액
     * @return 계좌번호를 통해 조회된 계좌의 정보, 조회되지 않았다면 null
     */
    public Account inquiry(String accountNumber) {
        // your code..
        return repository.findById(accountNumber);
    }
}
