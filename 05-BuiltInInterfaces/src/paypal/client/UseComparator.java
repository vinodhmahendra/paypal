package paypal.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		
		//simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple Sort");
		for ( String eachElement: strings) {
			System.out.println(eachElement);
		}
		
		//case insensitive sort with an  lambda expression
		Comparator<String> comp = (str1,str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		
		Collections.sort(strings,comp);
		System.out.println("Sort with Comparator");
		for ( String eachElement: strings) {
			System.out.println(eachElement);
		}

	}

}
