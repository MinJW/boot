package com.mjw.controller;

import com.mjw.Service.PersonService;
import com.mjw.bean.Person;
import com.mjw.bean.ReturnModel;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController extends BaseRestController{

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public ReturnModel addPersons(Person person){
        personService.addPerson(person);
        return SUCCESS(person);
    }

    @GetMapping("/person")
    public ReturnModel getPersons(){
        List<Person> persons = personService.getPerson();
        return SUCCESS(persons);
    }
}
