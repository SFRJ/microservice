package com.javing.microservice.personsmanagement.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Person {

    private UUID identifier;
    private String name;
    private Integer age;
    private String address;
    private LocalDateTime createdAt;
}
