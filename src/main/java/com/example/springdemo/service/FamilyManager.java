package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springdemo.domain.Family;

@Component
public class FamilyManager {
	
	@Autowired
	Family family;
	
	public String nameOfFather() {
		return family.getFather().getFirstName();
	}

}
