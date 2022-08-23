package paypal.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import paypal.model.Student;

public class TestComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
		studentList.add(new Student("George Washington", 3333, 3.4));
		studentList.add(new Student("John Adams", 2222, 3.9));
		
		Comparator<Student> sortName = new StudentSortName();
		Collections.sort(studentList,sortName);
	
		for ( Student eachStudent: studentList) {
			System.out.println(eachStudent);
		}
		
		Comparator<Student> sortGpa = new StudentSortGpa();
		Collections.sort(studentList, sortGpa );
		
		for ( Student eachStudent: studentList ) {
			System.out.println(eachStudent);
		}
	
	}

}
