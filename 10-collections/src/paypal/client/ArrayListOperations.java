package paypal.client;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

	public static void main(String[] args) {
		List<Integer> partList = new ArrayList<>(2);
		
		partList.add(new Integer(1111));
		partList.add(new Integer(2222));
		partList.add(new Integer(3333)); // ArrayList auto grows
		
		System.out.println("First Part: " + partList.get(0)); // First Item
		
		partList.add(0, new Integer(5555));
		partList.set(1, new Integer(6666));
		
		
		for (Integer eachElement : partList) {
			int partNumber = eachElement;
			System.out.println("Part Number: " + partNumber);
		}
		

	}

}
