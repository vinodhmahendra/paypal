package paypal.model;

public class Student {
	
	private String name;
	private long id;
	private double gpa = 0.0;
	
	

	public Student(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}



	public String getName() {
		return name;
	}



	public long getId() {
		return id;
	}



	public double getGpa() {
		return gpa;
	}


	@Override
	public String toString() {
		
		return "Name: " + this.name + " ID: " + this.id
				+ " GPA: " +this.gpa;
	}
	
	
}
