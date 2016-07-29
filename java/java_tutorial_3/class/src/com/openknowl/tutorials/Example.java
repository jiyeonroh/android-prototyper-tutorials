package com.openknowl.tutorials;

public class Example {
    // 클래스 안의 모든 변수, 함수에는 접근지정자를 지정할 수 있다.
    // 접근지정자란
    // 이 클래스에 접근할 수 있는 범위를 지정하는 것이다.

    // private/protected/default/public 중 하나를 가질 수 있다.
    // 예를 들어,

    // 접근지정자로 private 을 지정한다면,
    // 자기 자신에서만 지정한 메소드나 변수로 접근할 수 있다.

    // 접근지정자로 protected 을 지정한다면,
    // 자기 자신과, 자신을 상속한 클래스(인스턴스)에서만
    // 지정한 메소드나 변수로 접근할 수 있다.

    // 접근지정자로 default(아무것도 없는 경우)
    // 같은 패키지에서는 지정한 메소드나 변수로 접근할 수 있다.

    // 접근지정자로 public 을 선택한 경우
    // 모든 클래스가 지정한 메소드나 변수로 접근할 수 있다.

    // 클래스 아래에 있는 변수는 멤버변수라고 칭한다.
    // 멤버 변수(함수, 메소드)는
    // 하나의 '인스턴스'에서 유효하다
    String name;
    int age;

    // 클래스 아래에 있는 static 변수는 정적변수라 칭한다.
    // 정적 변수(함수, 메소드)는
    // 하나의 '클래스'에서 유효하다.
    static String NAME;
    static int AGE;

    // 객체지향 개념은 프로그래밍을 하는데 정말 중요하다고 생각된다.
    // 구글드라이브의 참고 ppt를 꼭 읽어보고,
    //
    // OOP 5대 원칙에 대해서 읽어보도록하자.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNAME() {
        return NAME;
    }

    public static void setNAME(String NAME) {
        Example.NAME = NAME;
    }

    public static int getAGE() {
        return AGE;
    }

    public static void setAGE(int AGE) {
        Example.AGE = AGE;
    }
}
