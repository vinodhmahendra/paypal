
public class TestEquals {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(21,8,2022);
		MyDate date2 = new MyDate(21,8,2022);
		
		if ( date1 == date2 ) {
			System.out.println("date1 is identical to date2");
		}else {
			System.out.println("date1 is not identical to date2");
		}
		
		if (date1.equals(date2)) {
			System.out.println("date1 is equal to date2");
		}else {
			System.out.println("date1 is not equal to date2");
		}
		
		System.out.println("set dae2 = date1;");
		date2 = date1;
		if ( date1 == date2 ) {
			System.out.println("date1 is identical to date2");
		}else {
			System.out.println("date1 is not identical to date2");
		}
	}

}
