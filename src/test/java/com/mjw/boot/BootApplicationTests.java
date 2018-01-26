package com.mjw.boot;

import com.mjw.bean.Person;
import com.mjw.dao.PersonDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private PersonDao personDao;

	@Test
	public void fun(){
		Person person = new Person("ccc",222);
		personDao.addPerson(person);
	}

}
