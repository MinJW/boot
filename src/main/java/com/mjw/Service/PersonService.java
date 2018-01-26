package com.mjw.Service;

import com.mjw.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonService {

    public void addPerson(Person person);

    public List<Person> getPerson();
}
