package com.nald.controller;

import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nald.ApprovedStatus;
import com.nald.Child;
import com.nald.Person;
import com.nald.PersonRepo;
import com.nald.model.Stock_Request;
import com.nald.model.UserAuth;
import com.nald.service.UserRepo;

@RestController
public class PersonResource {

	PersonRepo repo = new PersonRepo();

	@CrossOrigin
	@GetMapping("Persons")
	public List<Person> getPerson() {
		return repo.getPersons();
	}

	ObjectMapper mapper = new ObjectMapper();

	@CrossOrigin
	@PostMapping("Create")
	public Person createPerson(@Valid @RequestBody Person person, BindingResult bindingResult)
			throws JsonParseException, JsonMappingException, IOException { 
		 

//		String result = java.net.URLDecoder.decode(person, StandardCharsets.UTF_8);

//		Person personObject = mapper.readValue(person, Person.class);

		if (bindingResult.hasErrors()) {
			System.out.println("Error null values");
		}
		return repo.createPerson(person);
	}

	@CrossOrigin
	@PostMapping("List")
	public List<Person> createPersons(@RequestBody List<Person> person) {
//		List<Person> persons = new ArrayList<>();
//		persons.addAll(person);975

		for (Person p : person) {
			System.out.println("Person Id: " + p.getPersonId() + "Person Name : " + p.getPersonName() + "Person Age : "
					+ p.getPersonAge());
		}
//		return person;
		return repo.createPersons(person);
	}

	public Person getPerson(String personId) {
		Person person = new Person();
		return person;
	}
	
	@CrossOrigin
	@PostMapping("requestedStocks")
	public List<Stock_Request> requestedStocks(@RequestBody List<Stock_Request> stockRequest) {
		for (Stock_Request sr : stockRequest) {
			System.out.println(sr.toString());
		}
		
		return repo.createStockRequest(stockRequest);
	}

	@CrossOrigin
	@GetMapping(value = "getChildren/{id}")
	public List<Child> getChildren(@PathVariable("id") String personId) {
		return repo.getChildren(personId);
	}

	@CrossOrigin
	@PostMapping(value = "setChild/{id}")
	public Child setChild(@RequestBody Child child, @PathVariable("id") String personId) {
		return repo.setChildren(child, personId);
	}

	@CrossOrigin
	@GetMapping("getApproved")
	public List<ApprovedStatus> getApproved() {
		return repo.getApproved();
	}
	
	@CrossOrigin
	@PostMapping
	public Boolean authenticateUser(@RequestBody UserAuth user) {
		UserRepo userRepo = new UserRepo();
		return userRepo.authenticateUser(user);
	}
}
