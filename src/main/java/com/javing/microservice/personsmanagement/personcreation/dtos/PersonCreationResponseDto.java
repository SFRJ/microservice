package com.javing.microservice.personsmanagement.personcreation.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class PersonCreationResponseDto {

    private UUID personIdentifier;
    private LocalDateTime creationTime;

}
