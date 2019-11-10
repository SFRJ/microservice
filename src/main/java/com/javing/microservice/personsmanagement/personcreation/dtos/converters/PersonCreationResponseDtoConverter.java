package com.javing.microservice.personsmanagement.personcreation.dtos.converters;

import com.javing.microservice.personsmanagement.model.Person;
import com.javing.microservice.personsmanagement.personcreation.dtos.PersonCreationResponseDto;
import org.modelmapper.AbstractConverter;

public class PersonCreationResponseDtoConverter extends AbstractConverter<Person, PersonCreationResponseDto> {

    @Override
    protected PersonCreationResponseDto convert(Person source) {
        return PersonCreationResponseDto.builder()
                .personIdentifier(source.getIdentifier())
                .creationTime(source.getCreatedAt())
                .build();
    }
}
