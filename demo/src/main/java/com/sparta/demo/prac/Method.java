package com.sparta.demo.prac;

public class Method {
    public static void main(String[] args) {
        //    메소드가 없을 때
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
        System.out.println();

        printInfo();
        System.out.println();

        simplePrint();
        simpleSum(3, 5);
        int simpleReturn =  simpleReturn();
        System.out.println(simpleReturn);
        int sum = sum(2, 7);
        System.out.println(sum);

        int sub = sub(10, 8);
        System.out.println(sub);
    }

    //    메소드가 있을 때
    public static void printInfo() {
        String mTitle = "앱개발의 봄 React";
        String mTutor = "황서경";
        int mWeeks = 4;
        float mRatings = 4.5f;

        System.out.println("제목: " + mTitle);
        System.out.println("튜터: " + mTutor);
        System.out.println("주차: " + mWeeks);
        System.out.println("별점: " + mRatings);
    }

    //    파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    //    파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    //    파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    //    파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 연습퀴즈 - 메소드
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
}
