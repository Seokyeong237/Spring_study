package com.sparta.demo.prac;

public class Tutor {
    //    멤버 변수
    private String name;
    private String bio;

    //    기본 생성자
    public Tutor() {

    }

    //    name, bio 입력받는 생성자
    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    //    Getter
    public String getName() {
        return this.name;
    }
    //    Getter
    public String getBio() {
        return this.bio;
    }
    //    Setter
    public void setName(String name) {
        this.name = name;
    }
    //    Setter
    public void setBio(String bio) {
        this.bio = bio;
    }
}
