package paypal.client;

import java.util.*;

import paypal.model.Employee;
import paypal.model.Engineer;
import paypal.model.Manager;

public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome to OOPS!");

		List list = new ArrayList();
		
		list.add(new  Engineer ( "Fred","Cartz",47000,"B Tech","YES"));
		
		Manager manager = new Manager("Clarence", "Tauro", 57000, 30);
		list.add(manager);
		
		
		for ( int i = 0; i < list.size() ; i++) {
			Employee employee = (Employee) list.get(i);
			employee.increaseSalary(0.10); // 10%
		}
		
	}

}
