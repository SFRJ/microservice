package com.javing.microservice.personsmanagement;

import com.javing.microservice.personsmanagement.model.Person;
import com.javing.microservice.personsmanagement.personcreation.PersonCreationService;
import com.javing.microservice.personsmanagement.personcreation.dtos.PersonCreationRequestDto;
import com.javing.microservice.personsmanagement.personcreation.dtos.PersonCreationResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PersonsManagementController {

    private final PersonCreationService personCreationService;
    private final ModelMapper modelMapper;

    @RequestMapping(value = "/create_person", consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE},
    method = RequestMethod.POST)
    public ResponseEntity<PersonCreationResponseDto> addPerson(@RequestBody PersonCreationRequestDto request) {

        return ResponseEntity.ok(modelMapper.map(personCreationService
                .createPerson(modelMapper.map(request, Person.class)), PersonCreationResponseDto.class));
    }

}
