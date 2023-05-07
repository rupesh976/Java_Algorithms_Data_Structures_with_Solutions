package com.testskills.linkedlist;

public class App {

	public static void main(String[] args) {

		LinkedList<Person> people = new LinkedList<>();

		Person p = new Person(20, "Daniel");

		people.insert(p);
		people.insert(new Person(30, "Michale"));
		people.insert(new Person(40, "Harry"));

		people.remove(p);
		people.traverse();

	}

}
