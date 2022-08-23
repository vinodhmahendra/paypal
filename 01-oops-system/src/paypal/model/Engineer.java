package paypal.model;

// sub class 

public class Engineer extends Employee{

	public Engineer ( String fname,String lname,double salary,String education,String hardware) {
		super(fname,lname,salary);
		this.education = education;
		this.hardware = hardware;
	}
	
	@Override
	public void increaseSalary(double amt) {
		System.out.println("increase salary : Employee Class");
		
	}
	private String education;
	private String hardware;

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public void designSoftware() {
		System.out.println("Design Software");
//		return ; implicit return is present
	}

	public void implementCode() {
		System.out.println("Implement Code");
	}

	@Override
	public int getObjectID() {
		return 201;
	}
	
	@Override
	public void notifyAboutActivity() {
		System.out.println("present -- attend the meeting");
	}
}
