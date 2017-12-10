package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springdemo.domain.Person;

@Component
public class PersonManager {

	@Autowired
	@Qualifier("zosia")
	private Person person;

	public String sayName() {
		return "I'm " + person.getFirstName() + "!";
	}

}
