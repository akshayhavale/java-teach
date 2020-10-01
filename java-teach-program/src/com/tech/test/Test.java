package com.tech.test;

import java.util.Scanner;

import com.tech.model.Contact;
import com.tech.model.Person;
import com.tech.service.LogicsPerformance;

public class Test {

	public static void main(String[] args) {

		System.out.println("Please instert Person Deatails");

		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		System.out.println("Insert Person Name");
		String name = sc.next();
		person.setName(name);
		System.out.println("The name of person you inserted is " + name);
		Contact contact = new Contact();
		System.out.println("Insert Phone Number");
		String phoneNumber = sc.next();
		contact.setPhoneNumber(phoneNumber);
		System.out.println("The phone number you inserted is " + phoneNumber);
		person.setContact(contact);

		LogicsPerformance logic = new LogicsPerformance();

		System.out.println(logic.save(person));

//////////////////////////////////////////////////////////////////////		
		System.out.println("Please instert Person Deatails");

		Scanner sc1 = new Scanner(System.in);
		Person person1 = new Person();
		System.out.println("Insert Person Name");
		String name1 = sc1.next();

		person1.setName(name1);
		System.out.println("The name of person you inserted is " + name1);
		Contact contact1 = new Contact();
		System.out.println("Insert Phone Number");
		String phoneNumber1 = sc1.next();
		contact1.setPhoneNumber(phoneNumber1);
		System.out.println("The phone number you inserted is " + phoneNumber1);
		person1.setContact(contact1);

		System.out.println(LogicsPerformance.save(person1));

		System.out.println(person.equals(person1));

		System.out.println("Memory Location of Peron " + person.hashCode());

		System.out.println("Memory Location of Person1 " + person1.hashCode());

	}

}
