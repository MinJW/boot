package com.mjw.Service.impl;

import com.mjw.Service.PersonService;
import com.mjw.bean.Person;
import com.mjw.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    public List<Person> getPerson() {
        return personDao.getPerson();
    }
}
