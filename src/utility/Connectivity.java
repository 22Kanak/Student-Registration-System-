package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connectivity {
 public static Connection getConnection() throws SQLException {
		 
		 Connection connection = null ;
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 String url = "jdbc:mysql://localhost:3306/Automated_Student_Registration_System";
		 
		 try {
			connection = DriverManager.getConnection(url,"root","Kanakk@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e.getMessage());
		}
		 
		return connection;
		 
	 }
}
