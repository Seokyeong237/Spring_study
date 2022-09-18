package com.sparta.demo.prac;

public class Variable {
    public static void main(String[] args) {
        String myName = "황서경";

        int a = 1;
        float b = 1.2f;
        float c = a + b;
        String d = "자바 스프링, 5주 안에 끝낸다!";

        int age = 10;
        boolean isAdult = true;

        if (age > 19) {
            System.out.println("어른?? " + isAdult + "!!");
        }
        else {
            isAdult = false;
            System.out.println("어른?? " + isAdult + "!!");
        }

        System.out.println(myName);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
