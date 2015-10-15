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

		DBQueries yup = new DBQueries();
		databaseSetterUpper DB = new databaseSetterUpper(yup.checkCredentials());
		PreparedStatement pstmt = DB.pstmt;
		ResultSet rs;
		try {
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(!rs.isBeforeFirst()){
				System.err.println("Unauthorised Access\n");
				System.out.println("Exiting - bye!");
				System.exit(0);
			}

			while (rs.next()) {
				
				String dbUsername = rs.getString("username");
				String dbPassword = rs.getString("passcode");
					if(dbUsername.equals(userName) && dbPassword.equals(password)){
						Admin admin = new Admin();
						admin.adminMenu();
					}
			}
			
			}
		finally{
			
		}
			}

	}