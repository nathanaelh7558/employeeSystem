package employeeSystem;

import java.sql.SQLException;
import java.text.ParseException;

import javax.sql.rowset.serial.SerialException;

import admin.Admin;

public class DBQueries {

	public DBQueries() {
		// TODO Auto-generated constructor stub
	}
	public String addUser(){
		String query = "CALL insertEmployee(?,?,?,?,?,?);";
		return query;
	}
	public String removeUser(){
		String query = "CALL removeEmployee(?);";
		return query;
	}
	public String updateUser(){
		String query = "CALL updateEmployee(?,?,?,?,?,?,?);";
		return query;
	}
	public String assignToProject(){
		String query = "CALL assignToProject(?,?,?,?);";
		return query;
	}
	
	
	
	public String checkCredentials(){
		
		String userCheck = "SELECT username, passcode FROM credentials WHERE username = ? AND passcode = ?;";
		
		return userCheck;
				
	}
	
}
