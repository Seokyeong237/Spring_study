package com.sparta.week02_assignment.service;

import com.sparta.week02_assignment.domain.Person;
import com.sparta.week02_assignment.domain.PersonRepository;
import com.sparta.week02_assignment.models.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
