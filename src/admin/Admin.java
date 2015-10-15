package admin;
import java.sql.Blob;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		employeeObject user = getEmployeeDetails();
			if(util.runAddUserQuery(yup.addUser(), user.getDOB(), user.getFirstName(), user.getsurName(), user.getTitle(),(Blob) null,user.getSalary())){
				System.out.println("Employee Created");
			} else {
				System.out.println("Could Not Create Employee");
			}
//			getEmployeeDetails();
		}else if (answer.equals("2")){
			 java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			    System.out.println("utilDate:" + utilDate);
			    System.out.println("sqlDate:" + sqlDate);
			//Answer is 2
		}else if(answer.equals("3")){
			System.out.println("Enter projectId of project");
			String temp2 = scanner.nextLine();
			System.out.println("Enter employeeId of employee to be assigned");
			String temp = scanner.nextLine();
			System.out.println("Please enter the date the employee will start working on this project");
			String startDate = scanner.nextLine();
			System.out.println("DOB: ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			java.sql.Date dob = null;
			try {
				dob = (Date) formatter.parse(startDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(dob);
			System.out.println("Please enter the date the employee will stop working on this project");
			String endDate = scanner.nextLine();
			if(util.runAssignUserQuery(yup.assignToProject(), Integer.parseInt(temp), Integer.parseInt(temp2), dob, dob)){
				System.out.println("Employee Assigned.");
			} else{
				System.out.println("Employee Could Not Be Assigned to this project.");
			}		}else if(answer.equals("4")){
			System.out.println("Enter employeeId of employee to be deleted...");
			String temp = scanner.nextLine();
			if(util.runRemoveUserQuery(yup.removeUser(), Integer.parseInt(temp))){
				System.out.println("Employee Deleted.");
			} else{
				System.out.println("Employee Could Not Be Deleted.");
			}
		}else{	
			System.out.println("Please enter a valid selection");
			adminMenu();
		}
	}	
	
	
	public employeeObject getEmployeeDetails(){
		//Initialize variables 
		String firstName, surname, title, picture, tempDOB;
		Double salary;	
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
      //Converts string to date
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date dob = null;
		java.sql.Date sqlDate = null;
		try {
			dob = formatter.parse(tempDOB);
		    sqlDate = new java.sql.Date(dob.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Get salary
		System.out.print("Employee's salary: ");
		salary = scanner.nextDouble();
		employeeObject newEmployee = new employeeObject(firstName, surname, title, salary, sqlDate);
		return newEmployee;
	}
	public static void main(String[] args) {


	}

}
