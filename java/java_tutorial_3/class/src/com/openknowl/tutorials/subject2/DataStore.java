package com.openknowl.tutorials.subject2;

public class DataStore {

    private static Account[] accounts;

    static {
        accounts = new Account[20];

        accounts[0] = new Account("001", "홍길동", 50000);
        accounts[1] = new Account("002", "전우치", 50000);
        accounts[2] = new Account("003", "임꺽정", 50000);
        accounts[3] = new Account("004", "장길산", 50000);
        accounts[4] = new Account("005", "허준", 50000);
        accounts[5] = new Account("006", "세종대왕", 250000);
        accounts[6] = new Account("007", "신사임당", 250000);
        accounts[7] = new Account("008", "이이", 250000);
        accounts[8] = new Account("009", "이황", 250000);
        accounts[9] = new Account("010", "임요환", 50000);
        accounts[10] = new Account("011", "이윤열", 50000);
        accounts[11] = new Account("012", "이제동", 50000);
        accounts[12] = new Account("013", "최연성", 50000);
        accounts[13] = new Account("014", "마재윤", 50000);
        accounts[14] = new Account("015", "허영무", 50000);
        accounts[15] = new Account("016", "김택용", 50000);
        accounts[16] = new Account("017", "도재욱", 50000);
        accounts[17] = new Account("018", "송병구", 50000);
        accounts[18] = new Account("019", "구승빈", 150000);
        accounts[19] = new Account("020", "권창훈", 150000);
    }

    /**
     * 데이터베이스(In-memory)에 저장된 account 정보를 파라메터로 받은 accountNumber로 조회하여
     * 일치하는 값이 있다면 정보 전체를 돌려주고, 없다면 null을 돌려줌
     *
     * @param accountNumber
     * @return 계좌번호가 일치하는 계좌의 정보
     */
    public static Account findById(String accountNumber) {
        if (accountNumber == null || accountNumber.length() == 0) {
            return null;
        }

        for (Account account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }

        return null;
    }

    /**
     * account에 저장된 accountNumber 값을 통해 account 를 조회하여
     * 데이터베이스(In-memory)에 저장된 account 정보를
     * 파라메터로 받은 account의 정보로 변경해줌
     *
     * @param account 수정하려고 하는 객체의 상태
     * @return 수정되었다면 true, 객체를 찾을 수 없었다면 false
     */
    public static boolean update(Account account) {
        Account storedAccount = findById(account.getAccountNumber());
        if (storedAccount == null) {
            return false;
        }

        storedAccount.setOwner(account.getOwner());
        storedAccount.setBalance(account.getBalance());
        return true;
    }
}
