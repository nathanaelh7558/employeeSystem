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

		System.out.println("Welcome! Please provide your login credentials!");
		
		System.out.print("Username: ");
		String userName = scanner.nextLine();
		
		System.out.print("Password: ");
		String password = scanner.nextLine();
		
		DBQueries.checkCredentials(userName, password);
		
		DBQueries yup = new DBQueries();

		
	}

}
