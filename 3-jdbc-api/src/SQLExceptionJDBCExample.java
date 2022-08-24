import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionJDBCExample {

	public static void main(String[] args) throws ClassNotFoundException {


		String url = "jdbc:mysql://localhost:3306/paypal";
		String user = "root";
		String password = "admin";
		//step #1 : load a driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String query = "SELECT * FROM employeeeee";
		try (
				Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)
				
				
				) {
			System.out.println("Got Connection!");
			
			while ( rs.next() ) {
				int empId = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				
				System.out.println("Employee ID: " + empId +"\n" + "Employee Name:" + name + "\n" +"Salary: " + salary);
				
			}
		} catch (SQLException e) {
			
				System.out.println("SQLState: " + e.getSQLState());
				System.out.println("Error Code: " + e.getErrorCode());
				System.out.println("Message: " +e.getMessage());
				
				Throwable t = e.getCause();
				while ( t != null) {
					System.out.println("Cause:" + t);
					t = t.getCause();
				}
			
		}

	}

}
