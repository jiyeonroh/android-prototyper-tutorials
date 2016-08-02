class Foo {
    public static void main(String args[]) {
        // main 함수는 프로그램의 시작점.
        // 파라메터로 String 배열을 받을 수 있다.
        // 프로그램 실행 시 문자열 여러개를 넘길 수 있음.
        // javac 명령어로 컴파일을 한 후
        // java Foo 커맨드 를 입력해보자.
        if (args.length == 0) {
            System.err.println("옵션을 입력하세요");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("argument seq = " + i + " / " + args[i]);
        }
    }
}
