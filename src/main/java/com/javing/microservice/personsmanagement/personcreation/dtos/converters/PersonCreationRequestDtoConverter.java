package com.javing.microservice.personsmanagement.personcreation.dtos.converters;

import com.javing.microservice.personsmanagement.model.Person;
import com.javing.microservice.personsmanagement.personcreation.dtos.PersonCreationRequestDto;
import org.modelmapper.AbstractConverter;

import java.time.LocalDateTime;
import java.util.UUID;

public class PersonCreationRequestDtoConverter extends AbstractConverter<PersonCreationRequestDto, Person> {

    @Override
    protected Person convert(PersonCreationRequestDto source) {

        return Person.builder().identifier(UUID.randomUUID())
                .name(source.getName())
                .age(source.getAge())
                .address(source.getAddress())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
