package employeeSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class databaseSetterUpper {
	protected static Logger log = Logger.getLogger(employeeObject.class.getName());

//	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost:3306/EmpDB";
	private Connection connection;
	public PreparedStatement pstmt= null;
		private String username= "root";
		private String password= "ch@ngeme1";
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
			connection = DriverManager.getConnection(DB_URL, username, password);
			log.info("Connecting to database: " + DB_URL);
			log.info("Connecting to database with username: " + username);
			log.info("Connecting to database with password: " + password);
			pstmt = connection.prepareStatement(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.warning("Couldnt connect, witht this exception: " + e);
		}
		
	}

}
