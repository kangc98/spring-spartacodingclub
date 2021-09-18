package com.sparta.week02_hw.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonRequestDto {
    private final long id;
    private final String name;
    private final int age;
    private final String address;
    private final String job;
}
