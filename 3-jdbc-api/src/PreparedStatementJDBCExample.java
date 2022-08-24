import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementJDBCExample {

	public static void main(String[] args) throws ClassNotFoundException {


		String url = "jdbc:mysql://localhost:3306/paypal";
		String user = "root";
		String password = "admin";
		//step #1 : load a driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String query = "SELECT * FROM employee where id = ?"; // dynamic query
		try (
				Connection con = DriverManager.getConnection(url, user, password);
				
				
				) {
			
			PreparedStatement stmt  = con.prepareStatement(query);
			stmt.setInt(1, 2);
			ResultSet rs = stmt.executeQuery();
			
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
