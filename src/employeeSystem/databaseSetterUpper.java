package employeeSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseSetterUpper {
//	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost:3306/EmpDB";
	private Connection connection;
	public PreparedStatement pstmt= null;
		
	public databaseSetterUpper(String x, int chris) {
		try {
			connection = DriverManager.getConnection(DB_URL, "chrisr", "chrisrocks");
			pstmt = connection.prepareStatement(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	public databaseSetterUpper(String x) {
		try {
			connection = DriverManager.getConnection(DB_URL, "root", "ch@ngeme1");
			pstmt = connection.prepareStatement(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
