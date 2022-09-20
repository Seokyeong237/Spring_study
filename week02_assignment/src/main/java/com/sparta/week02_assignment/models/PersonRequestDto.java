package com.sparta.week02_assignment.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonRequestDto {
    private String name;
    private int age;
    private String address;
    private String job;
}
