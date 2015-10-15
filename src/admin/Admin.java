package admin;
import java.sql.Date;
import java.util.Scanner;

import employeeSystem.DBQueries;
import employeeSystem.employeeObject;
import util.Util;



public class Admin {

	
public Admin(){
	
}
		String answer;
		Scanner scanner = new Scanner(System.in);
		DBQueries yup = new DBQueries();	
	public void adminMenu(){
		String answer;
		System.out.println("What would you like to do? ");
		System.out.println("1: Add employee || 2: Assign employee to project || 3: Update employee || 4: Remove employee");
		answer = scanner.nextLine();
		System.out.println("");
		Util util = new Util();
		if(answer.equals("1")){			
			Date date = new Date(14, 04, 1995);
			util.runAddUserQuery(yup.addUser(), date, "bill", "bob", "mr", null,5600.50);
//			getEmployeeDetails();
		}else if (answer.equals("2")){
			 java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			    System.out.println("utilDate:" + utilDate);
			    System.out.println("sqlDate:" + sqlDate);
			//Answer is 2
		}else if(answer.equals("3")){
			//Answer is 3
		}else if(answer.equals("4")){
			util.runRemoveUserQuery(yup.removeUser(), 4);
		}else{			
		}
	}	
	
	
	public void getEmployeeDetails(){
		//Initialize variables 
		String firstName, surname, title, picture, tempDOB;
		Float salary;	
		Date DOB;
		//Outputs helper text
		System.out.println("Provide the new employee''s details in following: ");
		System.out.println("Employee's title:  ");
		title = scanner.nextLine();
		//Get firstName
		System.out.print("Employee's firstname:  ");
		firstName = scanner.nextLine();
		//Get surname
		System.out.print("Employee's surname:  ");
		surname = scanner.nextLine();
		//Get DOB
		System.out.print("Employee's DOB:  ");
		tempDOB = scanner.nextLine();
//		DOB = util.convertDate(tempDOB); //Converts string to date
		//Get salary
		System.out.print("Employee's salary: ");
		salary = scanner.nextFloat();
		employeeObject newEmployee = new employeeObject();
	}
	public static void main(String[] args) {


	}

}
