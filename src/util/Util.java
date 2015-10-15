package util;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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
}
