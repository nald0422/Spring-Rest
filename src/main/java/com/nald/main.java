package com.nald;

import java.util.ArrayList;
import java.util.List;

import com.nald.controller.PersonResource;

public class main {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		
		Person p = new Person();
		p.setPersonId("12");
		p.setPersonName("Donald");
		p.setPersonAge(12);
		
		person.add(p);
		
		PersonResource res = new PersonResource();
		
		res.createPersons(person);
	}
	
}
