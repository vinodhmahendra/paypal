package paypal.model;

// super class
public abstract class Employee implements Scheduleable{

	private String fname;
	private String lname;
	private double salary;
	
	public Employee(String fname,String lname,double salary) {
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public String getFirstName() {
		return fname;
	}

	public void setFirstName(String fname) {
		this.fname = fname;
	}

	public String getLastName() {
		return lname;
	}

	public void setLastName(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 1000) {
			this.salary = salary;
		}
	}

	public abstract void increaseSalary(double amt) ;
}
