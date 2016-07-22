package com.openknowl.tutorials.subject2;

import java.util.Scanner;

public class Subject {
    /*
     * 에금 입출력 시나리오.
     *
     * 가상의 계좌 n(시작시 입력)개를 입력받고,
     * 각각 예금, 인출, 계좌이체, 조회를 할 수 있는 메뉴를 만들 것
     * 1을 입력하면 예금,
     * 2를 입력하면 인출,
     * 3을 입력하면 계좌이체,
     * 4를 입력하면 조회를 할 수 있는 메뉴를 콘솔에 작성.
     * 5를 입력하면 종료. (종료는 return 문을 이용하지 않고 시킬 것)
     * 종료시에는 모든 계좌의 예금 상태를 보여줄 것
     *
     * 배열 파트의 과제로 제출했던 코드를,
     * Launcher, Account, AccountController, AccountRepository 로 나눠서 작성해볼 것
     * MVC 모델에 대해서 검색 및 이해를 한 후 코드를 작성하도록 함.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountController controller = new AccountController();

        int command;
        while (true) {
            System.out.println("원하는 기능을 선택하세요.");
            System.out.print("1을 입력하면 예금, 2를 입력하면 출금, " +
                    "3을 입력하면 계좌이체, 4를 입력하면 조회, 5를 입력하면 종료 : ");
            command = scanner.nextInt();

            if (command == 1) {
                // 계좌번호, 금액을 입력받은 후 예금 처리

                // ex..
                controller.deposit("001", 50000);
            } else if (command == 2) {
                // 계좌번호를 입력받은 후 인출 처리
            } else if (command == 3) {
                // 두 계좌번호를 입력받은 후 계좌이체 처리
            } else if (command == 4) {
                // 계좌번호를 입력받은 후 예금조회 처리
            } else if (command == 5) {
                // 종료
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        scanner.close();
    }

}
