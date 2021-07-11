package one.digitalInnovation.personApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalInnovation.personApi.Person;

@RestController
@RequestMapping("/api/people")

public class PersonController {

	@GetMapping
	public Person getBook() {
	Person person = new Person();
	person.setFirstName("John");
	return person;
	}
}
