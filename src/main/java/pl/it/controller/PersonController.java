package pl.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.it.dto.PersonDTO;

@RestController
public class PersonController {

    @GetMapping(value = "/sample-person")
    public PersonDTO getPerson() {
        return new PersonDTO(1L, "Andrzej");
    }
}
