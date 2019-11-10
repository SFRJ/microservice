package com.javing.microservice.personsmanagement.personcreation;

import com.javing.microservice.personsmanagement.model.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonCreationService {

    private final PersonsManagementRepository personsManagementRepository;

    public Person createPerson(final Person person) {

        return personsManagementRepository.createPerson(person);
    }
}
