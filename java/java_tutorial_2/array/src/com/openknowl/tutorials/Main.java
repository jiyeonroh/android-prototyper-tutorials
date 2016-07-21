package com.openknowl.tutorials;

public class Main {

    public static void main(String[] args) {
        int[] scores = new int[5];

        scores[0] = 5;
        scores[1] = 2;
        scores[2] = 3;
        scores[3] = 4;
        scores[4] = 1;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        String[] names = {
                "홍진호", "김대기", "임요환", "강도경", "최연성"
        };

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        int mathScores[] = {
                100, 100, 98, 50, 14
        };
        int totalMathScore = 0;

        for (int i = 0; i < mathScores.length; i++) {
            // totalMathScore = totalMathScore + mathScores[i]
            totalMathScore += mathScores[i];
        }
        System.out.println("수학점수의 총점 = " + totalMathScore);
        System.out.println("평점 = " + totalMathScore / mathScores.length);


    }
}
