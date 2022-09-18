package com.sparta.demo.prac;

import java.util.ArrayList;
import java.util.List;

public class Problem01 {
    public static void main(String[] args) {
        String course1 = "웹개발 종합반";
        String course2 = "앱개발 종합반";
        List<String> courseList = new ArrayList<>();

        courseList.add(course1);
        courseList.add(course2);

        System.out.println(courseList);
    }
}
