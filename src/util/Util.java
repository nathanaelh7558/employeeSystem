package util;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employeeSystem.DBQueries;
import employeeSystem.databaseSetterUpper;

public class Util {
	
	public String lowerCase(String input){
		String lowercase;
		lowercase = input.toLowerCase();
		return lowercase; 
	}
public boolean runAddUserQuery(String query, Date a, String fname, String sname, String title,Blob pic, Double salary ){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setDate(1, (java.sql.Date) a);
		pstmt.setString(2,fname);
		pstmt.setString(3,sname);
		pstmt.setString(4,title);
		pstmt.setBlob(5, pic);
		pstmt.setDouble(6,salary);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
public boolean runAddProjectQuery(String query, String Pname, Date a, Date b){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setDate(2, a);
		pstmt.setDate(3,b);
		pstmt.setString(1,Pname);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
public boolean runUpdateProjectQuery(String query, int ID, String Pname, Date a, Date b){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setDate(3, a);
		pstmt.setDate(4,b);
		pstmt.setString(2,Pname);
		pstmt.setInt(1,ID);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
public boolean runUpdateUserQuery(String query, int employeeId, Date a, String fname, String sname, String title,Blob pic, Double salary ){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setInt(1, employeeId);
		pstmt.setDate(2, (java.sql.Date) a);
		pstmt.setString(3,fname);
		pstmt.setString(4,sname);
		pstmt.setString(5,title);
		pstmt.setBlob(6, pic);
		pstmt.setDouble(7,salary);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}

public boolean runRemoveUserQuery(String query, int ID ){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setInt(1, ID);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
public boolean runRemoveProjectQuery(String query, int ID ){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setInt(1, ID);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
public boolean runAssignUserQuery(String query, int ID, int PID, Date start, Date end){
	DBQueries yup = new DBQueries();
	databaseSetterUpper DB = new databaseSetterUpper(query);
	PreparedStatement pstmt = DB.pstmt;
	
	try {
		pstmt.setInt(1, ID);
		pstmt.setInt(2, PID);
		pstmt.setDate(3, start);
		pstmt.setDate(4, end);
		pstmt.executeUpdate();	
		return true;
	} catch (SQLException e) {
		System.out.println(e);
		return false;
	}
}
//	public Date convertDate(String tempdate){
//		//Return like so - YYYY-MM-DD 00:00:00
//	}
	public void convertDate(String tempdate){
		System.out.println(tempdate);
		
		
		//Return like so - YYYY-MM-DD 00:00:00
	}
	
	

}
