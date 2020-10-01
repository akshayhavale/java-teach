package com.tech.service;

import java.util.ArrayList;
import java.util.List;

import com.tech.model.Person;

/**
 * 
 * @author Akshay
 *
 */
public class LogicsPerformance {

	/**
	 * @author Akshay
	 * @param person
	 * @return
	 */
	public static Person save(Person person) {

		createList().add(person);
		return person;
	}

	public static List<Person> createList() {
		List<Person> personList = new ArrayList<Person>();
		return personList;
	}

}
