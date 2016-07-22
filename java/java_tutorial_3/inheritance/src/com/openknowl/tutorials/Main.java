package com.openknowl.tutorials;

public class Main {

    public static void main(String[] args) {
        Pocketmon pikachu1 = new Pikachu();
        Pocketmon pikachu2 = new Pikachu();

        pikachu1.attack(pikachu2);
        System.out.println(pikachu1);
        System.out.println(pikachu2);

        // 아래 주석 코드는 안되는 이유 ?
        // pikachu2.evoluation();

        // 스스로 받은 이유.
        // 자기 자신의 인스턴스를 교체할 수 없음.
        // 여러 방법으로 우회할 수는 있으나 ..
        // 개념 공부만을 위해 일단 이렇게 구현.
        pikachu2 = ((Evolutionable) pikachu2).evolution();

        System.out.println(pikachu2);

        // 같은 공격이지만 .. 일반 피카추와 라이추의 공격력이 다름
        // 같은 행동이라고 표현 하지만, 실제로 내부적으로는 다른 일들이 일어남.
        // 오버라이딩.
        pikachu2.attack(pikachu1);
    }
}
