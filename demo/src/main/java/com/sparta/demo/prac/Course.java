package com.sparta.demo.prac;

public class Course {
    public String title;
    public String tutor;
    public int days;

    public Course() {

    }

    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    //     Getter
    public String getTitle() {
        return this.title;
    }
    //    Getter
    public String getTutor() {
        return this.tutor;
    }
    //    Getter
    public int getDays() {
        return this.days;
    }

    //    Setter
    public void setTitle(String title) {
        this.title = title;
    }
    //    Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    //    Setter
    public void setDays(int days) {
        this.days = days;
    }
}