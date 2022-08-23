package paypal.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import paypal.model.Person;

public class StaticMethodReference {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people,Person::compareAges);

		people.forEach(p -> System.out.println(p));
	}

}
