package paypal.model;

public class ComparableStudent implements Comparable<ComparableStudent> {
	
	private String name;
	private long id;
	private double gpa = 0.0;
	
	

	public ComparableStudent(String name, long id, double gpa) {
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
	
	@Override
	public int compareTo(ComparableStudent s) {
		int result = this.name.compareTo(s.getName());
		if ( result > 0 ) {
			return 1;
		}else if ( result < 0 ) {
			return -1;
		}else {
			return 0;
		}
	}
}
