package paypal.client;

import java.util.ArrayList;
import java.util.List;

public class CountItems {

	public static void main(String[] args) {
		System.out.println("creating list");
		List<String> strings = new ArrayList<>();
		for (int i = 0 ; i < 10000000 ; i++) {
			strings.add("Item " + i);
		}
		
		long count = strings.stream().parallel().count();
		System.out.println("Count : " + count);
		
	}

}
