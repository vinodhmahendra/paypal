package paypal.client;

import java.util.Arrays;
import java.util.stream.Stream;

import paypal.model.Person;

public class ArrayToStream {

	public static void main(String[] args) {
		Person[] people  = {
				new Person("Joe", 48),
				new Person("Mary", 30),
				new Person("Mike", 73)
		};
		
		
//		for ( int index = 0 ; index < people.length ; index++) {
//			System.out.println(people[index].getInfo());
//		}
		
//		Stream<Person> stream = Stream.of(people);
		Stream<Person> stream = Arrays.stream(people);
		
		stream.forEach(p-> System.out.println(p.getInfo()));
	}

}
