package paypal.model;

public class Manager extends Employee{

	private double quarterlyBonus;
	
	
	public Manager ( String fname,String lname,double salary,double quarterlyBonus) {
		super(fname,lname,salary);
		this.quarterlyBonus = quarterlyBonus;
	}
	// method overriding
	@Override
	public void  increaseSalary(double amt)  {
		// invoke a overridden method
//		super.increaseSalary(5000.00);
		System.out.println("Increase Salary : Manager Class");
	}
	
	public void playGolfWithClient() {
		System.out.println("playing!!");
	}
	
	@Override
	public int getObjectID() {
		return 101;
	}
	
	@Override
	public void notifyAboutActivity() {
		System.out.println("Absent --- working client");
	}
}
