package admin;

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
		System.out.println("1: Add employee ||"
				+ " 2: Assign employee to project || "
				+ "3: Update employee || "
				+ "4: Remove employee");
		
		answer = scanner.nextLine();
		System.out.println("");
		Util util = new Util();
		if (answer.equals("1")) {
			
			Date date = new Date(14, 04, 1995);
			if(util.runAddUserQuery(yup.addUser(), date, "bill", "bob", "mr", null,5600.50)){
				System.out.println("Employee Created");
			} else {
				System.out.println("Could Not Delete Employee");
			}			
		}else if (answer.equals("2")){
			
			 java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			    System.out.println("utilDate:" + utilDate);
			    System.out.println("sqlDate:" + sqlDate);
			    
		}else if(answer.equals("3")){
			
			//Update
			System.out.println("Enter ID of employee to be updated: ");
			int employeeId = scanner.nextInt();
			System.out.println("Enter details to update:");
			
			System.out.println("DOB: ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			String stringDob = scanner.nextLine();
			java.util.Date dob = formatter.parse(stringDob);
			
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
			
			if(util.runUpdateUserQuery(yup.updateUser(), employeeId, (Date) dob, f_name, l_name, title, pictureBlob, salary)){
				System.out.println("Employee " + employeeId + " updated!");
			};
			
		}else if(answer.equals("4")){
			System.out.println("Enter ID of employee to be deleted: ");
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

	public void getEmployeeDetails() {
		// Initialize variables
		String firstName, surname, title, picture, tempDOB;
		Float salary;
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
		// DOB = util.convertDate(tempDOB); //Converts string to date
		// Get salary
		System.out.print("Employee's salary: ");
		salary = scanner.nextFloat();
		employeeObject newEmployee = new employeeObject();
	}

	public static void main(String[] args) {

	}

}
