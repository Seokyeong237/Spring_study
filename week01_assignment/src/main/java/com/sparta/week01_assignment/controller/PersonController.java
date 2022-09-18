package com.sparta.week01_assignment.controller;

import com.sparta.week01_assignment.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getInfo() {
        Person person = new Person();
        person.setName("황서경");
        person.setAge(23);
        person.setAddress("경기도 파주시");
        person.setJob("대학생");
        return person;
    }
}
