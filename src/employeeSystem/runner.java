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
<<<<<<< HEAD
	
	public void getUserType(){
		String answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of user would you like to log in as? ");
		System.out.println("1: Admin || 2: Finance || 3: Chris Reid");
		answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			admin.adminMenu();
		}else if(answer.equals("2")){
			//Calls finance class
		}else if(answer.equals("3")){
			//Calls chris class
		}else{
			getUserType(); //Repeats 
		}	
	}
	
=======
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
			String username = rs.getString("employee_Fname");
			
				
			}
		
	} catch (SQLException e) {
		System.out.println(e);

	}
>>>>>>> master

}
}
