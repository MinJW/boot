package com.mjw.dao;

import com.mjw.bean.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonDao {

    public void addPerson(Person person);

    public List<Person> getPerson();

    public void addPersons(List<Person> persons);
}
