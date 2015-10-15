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
	

	public runner() {
	}

	
	public void getLoginDetails(){
		String answer;
		String userName, password;
		Scanner scanner = new Scanner(System.in);
		DBQueries yup = new DBQueries();
		System.out.println("What type of user would you like to log in as? ");
		System.out.println("1: Admin || 2: Finance || 3: Chris Reid");
		answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			Admin admin = new Admin();
			admin.adminMenu();
			
		}else if(answer.equals("2")){
			//Calls finance class
		}else if(answer.equals("3")){
			//Calls chris class
		}else{
			getLoginDetails(); //Repeats 
		}	

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
	


}
