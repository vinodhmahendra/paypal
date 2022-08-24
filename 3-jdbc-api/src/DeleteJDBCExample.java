import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJDBCExample {

	public static void main(String[] args) throws ClassNotFoundException {


		String url = "jdbc:mysql://localhost:3306/paypal";
		String user = "root";
		String password = "admin";
		//step #1 : load a driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String querySelect = "SELECT * FROM employee";
		String queryDelete = "DELETE FROM employee where id = 4";
		try (
				Connection con = DriverManager.getConnection(url, user, password);
				
				) {
			
			Statement stmt = con.createStatement();
			
			if ( stmt.executeUpdate(queryDelete) > 0) {
				System.out.println("An employee record was deleted successfully");
			}
			
			ResultSet rs = stmt.executeQuery(querySelect);
			System.out.println("Got Connection!");
			
			while ( rs.next() ) {
				int empId = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				
				System.out.println("Employee ID: " + empId +"\n" + "Employee Name:" + name + "\n" +"Salary: " + salary);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
