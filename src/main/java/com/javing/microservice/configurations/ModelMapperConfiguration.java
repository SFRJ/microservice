package com.javing.microservice.configurations;

import com.javing.microservice.personsmanagement.personcreation.dtos.converters.PersonCreationRequestDtoConverter;
import com.javing.microservice.personsmanagement.personcreation.dtos.converters.PersonCreationResponseDtoConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addConverter(new PersonCreationRequestDtoConverter());
        modelMapper.addConverter(new PersonCreationResponseDtoConverter());

        return modelMapper;
    }
}
