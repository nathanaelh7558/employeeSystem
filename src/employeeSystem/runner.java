package employeeSystem;
import admin.Admin;
import finance.Finance;
import chrisReid.ChrisReid;
import util.Util;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import employeeSystem.databaseSetterUpper;
import employeeSystem.DBQueries;

public class runner {
	Util util = new Util();
	Admin admin = new Admin();

	public runner() {
	}

	
	public void getLoginDetails(){
		String userName, password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome! Please provide your login credentials!");
		System.out.print("Username: ");
		userName = scanner.nextLine();
		System.out.print("Password: ");
		password = scanner.nextLine();
		authenticateUser(userName, password);
	}
	
	public boolean authenticateUser(String userName, String pass){
		boolean mrBoolean = false;
		//1.Get database connection
		//2. Run query
		//3. Get results
		return mrBoolean;
	}
	

public void testingDB(){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(yup.testQuery());
	PreparedStatement pstmt = DB.pstmt;
	ResultSet rs;
	try {
		rs = pstmt.executeQuery();
		if(!rs.isBeforeFirst()){
			System.out.println("No Employees");
		}
		while (rs.next()) {
			String username = rs.getString("fName");
			System.out.println(username);
				
			}
		
	} catch (SQLException e) {
		System.out.println(e);

	}


}
}
