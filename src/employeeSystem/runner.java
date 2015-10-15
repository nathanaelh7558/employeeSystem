package employeeSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import employeeSystem.databaseSetterUpper;
import employeeSystem.DBQueries;

public class runner {

	public runner() {
		// TODO Auto-generated constructor stub
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
