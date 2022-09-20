package com.sparta.week02_assignment.controller;

import com.sparta.week02_assignment.domain.Person;
import com.sparta.week02_assignment.domain.PersonRepository;
import com.sparta.week02_assignment.models.PersonRequestDto;
import com.sparta.week02_assignment.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonRepository personRepository;
    private final PersonService personService;

    // 친구 생성
    @PostMapping("/myinfo")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);

        return personRepository.save(person);
    }

    // 친구 목록 조회
    @GetMapping("/myinfo")
    public List<Person> getInfo() {
        return personRepository.findAll();
    }

    // 친구 정보 변경
    @PutMapping("/myinfo/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    // 친구 정보 삭제
    @DeleteMapping("/myinfo/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }
}
