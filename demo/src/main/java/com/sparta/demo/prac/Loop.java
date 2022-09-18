package com.sparta.demo.prac;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        //        반복문 없음
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println(fruits.get(6));
        System.out.println(fruits.get(7));
        System.out.println(fruits.get(8));
        System.out.println(fruits.get(9));
        System.out.println(fruits.get(10));
        System.out.println(fruits.get(11));
        System.out.println(fruits.get(12));
        System.out.println();

        //        반복문 있음
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);

            if (fruit == "감") {
                count += 1;
            }
        }
        System.out.println(count);

        //        연습퀴즈 - 반복문
        List<String> celebs = new ArrayList<>();

        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        for (int i=0; i<celebs.size(); i++) {
            String celeb = celebs.get(i);
            System.out.println(celeb);
        }

        int result = countFruit("딸기");
        System.out.println("개수는: " + result);
    }

    //        연습퀴즈 - 조건문 + 반복문
    public static int countFruit(String given) {
        List<String> pFruits = new ArrayList<>();
        pFruits.add("감");
        pFruits.add("배");
        pFruits.add("감");
        pFruits.add("딸기");
        pFruits.add("수박");
        pFruits.add("메론");
        pFruits.add("수박");
        pFruits.add("딸기");
        pFruits.add("메론");
        pFruits.add("수박");
        pFruits.add("메론");
        pFruits.add("수박");
        pFruits.add("감");

        int pcount = 0;

        for (int i = 0 ; i < pFruits.size(); i++) {
            String pFruit = pFruits.get(i);

            if (given == pFruit) {
                pcount += 1;
            }
        }
        return pcount;
    }
}
