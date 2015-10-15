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
	
	public static void checkCredentials(String user, String password) throws SerialException, SQLException, ParseException{
		
		String userCheck = "SELECT username, password FROM credentials WHERE username =" + user;
		String passwordCheck = "SELECT password FROM credentials WHERE username=" + user;
		
		if(userCheck == user && passwordCheck == password){
			Admin admin = new Admin();
			admin.adminMenu();
			
		}else{
			Admin admin = new Admin();
			admin.adminMenu();
		//	System.err.println("Incorrect credentials.");
			//System.exit(0);
		}
				
	}
	
}
