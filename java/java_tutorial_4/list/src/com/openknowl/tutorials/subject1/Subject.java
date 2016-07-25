package com.openknowl.tutorials.subject1;

public class Subject {

    public static void main(String[] args) {
        /*
         * 보통 프로그래밍을 하다보면, 언어에서 제공하는 배열이 아닌,
         * 어레이리스트, 해쉬맵 등의 커스텀된 클래스를 이용한
         * 자료구조를 많이 사용하게 된다.
         *
         * 이유를 알아보자.
         *
         * ---------------------
         *
         * java_tutorial_3/class/subject2의 account 클래스를 복사하여
         * 10번쨰 12번째, 12번째에 있는 계좌를 삭제해보자.
         *
         * 계좌 배열은 빈 객체가 들어간 인덱스가 있으면 안된다.
         * 즉 [idx] == null 이면 안되고,
         * 그 다음 위치의 계좌를 방금 삭제한 위치로 이동시켜야한다. 그뒤의 계좌들또한 마찬가지다.
         */
        Account[] accounts;

        accounts = initAccounts();
        remove(accounts, 10);

        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void remove(Account[] accounts, int idx) {
        accounts[idx] = null;
        // your code ..
        // 삭제만 하면 안되고.. 아이템들의 위치를 재배열 해주어야 한다.
    }

    public static Account[] initAccounts() {
        Account[] accounts = new Account[20];
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

        return accounts;
    }
}
