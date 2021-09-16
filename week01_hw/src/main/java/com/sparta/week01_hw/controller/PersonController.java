package com.sparta.week01_hw.controller;

import com.sparta.week01_hw.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("kksswkd");
        person.setAge(24);
        person.setAddress("Seoul");
        person.setJob("Student");
        return person;
    }
}
