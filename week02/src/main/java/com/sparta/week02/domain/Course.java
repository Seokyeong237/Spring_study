package com.sparta.week02.domain;

import com.sparta.week02.models.CourseRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자를 대신 생성해줌
@Entity // 테이블임을 나타냄
public class Course extends Timestamped{

    @Id // ID 값을 PK로 사용하겠다
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령
    private Long id;

    @Column(nullable = false) // 컬럼값이고 반드시 존재해야 함
    private String title;

    @Column(nullable = false)
    private String tutor;

    // 생성자
    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }

    public Course(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }

    public void update(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }
}