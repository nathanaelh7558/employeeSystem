package employeeSystem;
import admin.Admin;
import finance.Finance;
import chrisReid.ChrisReid;
import util.Util;

import java.text.ParseException;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import java.text.ParseException;

import employeeSystem.databaseSetterUpper;
import employeeSystem.DBQueries;

public class runner {
	Util util = new Util();
	

	public runner() {
	}
	public void getLoginDetails() throws SerialException, SQLException, ParseException{
		
		Scanner scanner = new Scanner(System.in);
		DBQueries yup = new DBQueries();
		System.out.println("What type of user would you like to log in as? ");
		System.out.println("1: Admin || 2: Finance || 3: Chris Reid");
		String answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			Admin admin = new Admin();
			try {
				admin.adminMenu();
			} catch (SerialException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(answer.equals("2")){
			//Calls finance class
		}else if(answer.equals("3")){
			//Calls chris class
		}else{
			getLoginDetails(); //Repeats 
		}	

//		System.out.println("Welcome! Please provide your login credentials!");
//		
//		System.out.print("Username: ");
//		String userName = scanner.nextLine();
//		
//		System.out.print("Password: ");
//		String password = scanner.nextLine();
//		
//		DBQueries.checkCredentials(userName, password);
//		
//		DBQueries yup = new DBQueries();

		
	}

}
