package admin;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialException;

import org.omg.CORBA.ORB;

import employeeSystem.DBQueries;
import employeeSystem.employeeObject;
import util.Util;

public class Admin {

	public Admin() {

	}

	String answer;
	Scanner scanner = new Scanner(System.in);
	DBQueries yup = new DBQueries();

	public void adminMenu() throws SerialException, SQLException, ParseException {

		String answer;

		System.out.println("What would you like to do? ");
		System.out
		.println("1: Add employee || "
				+ "2: Assign employee to project || "
				+ "3: Update employee || "
				+ "4: Remove employee ||"
				+ "5: Add project ||"
				+ "6: Update project ||"
				+ "7: Delete Project ||");
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
			System.out.println("Enter projectId of project");
			String temp2 = scanner.nextLine();
			System.out.println("Enter employeeId of employee to be assigned");
			String temp = scanner.nextLine();
			System.out.println("Please enter the date the employee will start working on this project");
			String startDate = scanner.nextLine();
			//Converts string to date
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date dob = null;
			java.sql.Date sqlDate = null;
			try {
				dob = formatter.parse(startDate);
				sqlDate = new java.sql.Date(dob.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter the date the employee will stop working on this project");
			String endDate = scanner.nextLine();
			java.util.Date dob2 = null;
			java.sql.Date sqlDate2 = null;
			try {
				dob2 = formatter.parse(endDate);
				sqlDate2 = new java.sql.Date(dob.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(util.runAssignUserQuery(yup.assignToProject(), Integer.parseInt(temp), Integer.parseInt(temp2), sqlDate, sqlDate2)){
				System.out.println("Employee Assigned.");
			} else{
				System.out.println("Employee Could Not Be Assigned to this project.");
			}

		}
		else if(answer.equals("3")){

			//Update
			System.out.println("Enter ID of employee to be updated: ");
			int employeeId = Integer.parseInt(scanner.nextLine());
			System.out.println("DOB: ");
			String tempDOB = scanner.nextLine();
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

			System.out.println("First name: ");
			String f_name = scanner.nextLine();

			System.out.println("Last name: ");
			String l_name = scanner.nextLine();

			System.out.println("Title: ");
			String title = scanner.nextLine();

			System.out.println("Pic: ");
			//String to Bytes[] to Blob
			String stringToBytes = scanner.nextLine();
			byte[] bytesToBlob = stringToBytes.getBytes();
			Blob pictureBlob = new javax.sql.rowset.serial.SerialBlob(bytesToBlob);

			System.out.println("Salary: ");
			Double salary = scanner.nextDouble();

			if(util.runUpdateUserQuery(yup.updateUser(), employeeId, sqlDate, f_name, l_name, title, pictureBlob, salary)){
				System.out.println("Employee " + employeeId + " updated!");
			};
		}
		else if(answer.equals("4")){
			System.out.println("Enter ID of employee to be deleted: ");
			String temp = scanner.nextLine();

			if(util.runRemoveUserQuery(yup.removeUser(), Integer.parseInt(temp))){
				System.out.println("Employee Deleted.");
			} else{
				System.out.println("Employee Could Not Be Deleted.");
			}
		}
		else if(answer.equals("5")){
			//add project
		}
		else if(answer.equals("6")){
			//update project
		}
		else if(answer.equals("7")){
			//delete project
		}
		else{	
			System.out.println("Please enter a valid selection");
			adminMenu();
		}
	}	


	public employeeObject getEmployeeDetails(){
		//Initialize variables 
		String firstName, surname, title, picture, tempDOB;
		Double salary;	
		Date DOB;
		// Outputs helper text
		System.out
		.println("Provide the new employee''s details in following: ");
		System.out.println("Employee's title:  ");
		title = scanner.nextLine();
		// Get firstName
		System.out.print("Employee's firstname:  ");
		firstName = scanner.nextLine();
		// Get surname
		System.out.print("Employee's surname:  ");
		surname = scanner.nextLine();
		// Get DOB
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
		// DOB = util.convertDate(tempDOB); //Converts string to date
		// Get salary
		System.out.print("Employee's salary: ");
		salary = scanner.nextDouble();
		employeeObject newEmployee = new employeeObject(firstName, surname, title, salary, sqlDate);
		return newEmployee;
	}

	public static void main(String[] args) {

	}

}
