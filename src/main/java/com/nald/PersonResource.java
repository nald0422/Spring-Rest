package com.nald;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(maxAge = 3600)
@RestController
public class PersonResource {

	PersonRepo repo = new PersonRepo();

	@CrossOrigin
	@GetMapping("Persons")
	public List<Person> getPerson() {
		return repo.getPersons();
	}

	ObjectMapper mapper = new ObjectMapper();

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

}
