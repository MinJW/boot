package com.mjw.controller;

import com.alibaba.fastjson.JSON;
import com.mjw.bean.Mjw;
import com.mjw.bean.Person;
import com.mjw.bean.UserEntity;
import com.mjw.dao.PersonDao;
import com.mjw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/test")
    public String test(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("yy",2));
        persons.add(new Person("yy",2));
        persons.add(new Person("yy",2));
        personDao.addPersons(persons);
        return "ok";
    }

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){
        List<UserEntity> users = userDao.searchAll();
        String usersJson = JSON.toJSONString(users);
        return usersJson;
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String addUser(UserEntity userEntity){
        userDao.add(userEntity);
        return JSON.toJSONString(userEntity);
    }

    @Value("mjw")
    private String name;

    @GetMapping("/name")
    public String name(){
        return name;
    }

    @Autowired
    private Mjw mjw;

    @GetMapping("/mjw")
    public String mjw(){
        return mjw.toString();
    }

}
