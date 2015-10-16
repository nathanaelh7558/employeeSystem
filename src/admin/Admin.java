package admin;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.sql.rowset.serial.SerialException;

import org.omg.CORBA.ORB;

import employeeSystem.DBQueries;
import employeeSystem.employeeObject;
import util.Util;

public class Admin {
employeeObject newUser = new employeeObject();
protected static Logger log = Logger.getLogger(employeeObject.class.getName());

	public Admin() {

	}

	String answer;
	Scanner scanner = new Scanner(System.in);
	DBQueries yup = new DBQueries();

	public void adminMenu() throws SerialException, SQLException, ParseException {

		String answer;

		System.out.println("What would you like to do? ");
		System.out.println("1: Add employee || "
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
			getEmployeeDetails();
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
		}else if(answer.equals("5")){
			System.out.println("Enter ID of project to be deleted: ");
			String temp = scanner.nextLine();

			if(util.runRemoveProjectQuery(yup.removeProject(), Integer.parseInt(temp))){
				System.out.println("Project Deleted.");
			} else{
				System.out.println("Project Could Not Be Deleted.");
			}
		}else if(answer.equals("6")){
			System.out.println("Enter Name of project to be added: ");
			String temp = scanner.nextLine();
			System.out.println("Enter project start date: ");
			String temp2 = scanner.nextLine();
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date dob = null;
				java.sql.Date sqlDate = null;
				try {
					dob = formatter.parse(temp2);
				    sqlDate = new java.sql.Date(dob.getTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Enter project end date: ");
			String temp3 = scanner.nextLine();
				java.util.Date dob2 = null;
				java.sql.Date sqlDate2 = null;
				try {
					dob2 = formatter.parse(temp3);
				    sqlDate2 = new java.sql.Date(dob2.getTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(util.runAddProjectQuery(yup.addProject(), temp, sqlDate,sqlDate2)){
				System.out.println("Project Added.");
			} else{
				System.out.println("Project Could Not Be Added.");
			}
		}else if(answer.equals("7")){
			System.out.println("Enter ID of project to be updated: ");
			int temp = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter Name of project: ");
			String temp2 = scanner.nextLine();
			System.out.println("Enter project start date: ");
			String temp3 = scanner.nextLine();
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date dob = null;
				java.sql.Date sqlDate = null;
				try {
					dob = formatter.parse(temp3);
				    sqlDate = new java.sql.Date(dob.getTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Enter project end date: ");
			String temp4 = scanner.nextLine();
				java.util.Date dob2 = null;
				java.sql.Date sqlDate2 = null;
				try {
					dob2 = formatter.parse(temp4);
				    sqlDate2 = new java.sql.Date(dob2.getTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(util.runUpdateProjectQuery(yup.updateProject(), temp,temp2, sqlDate,sqlDate2)){
				System.out.println("Project Updated.");
			} else{
				System.out.println("Project Could Not Be Updated.");
			}
		}
		else{	
			System.out.println("Please enter a valid selection");
			adminMenu();
		}
	}	

public Boolean setEmployeeTitle(){
	System.out.println("Employee's title:  ");
	String title = scanner.nextLine();
	if(title != null && !title.isEmpty()){
		newUser.setTitle(title);
		log.info("Employee title added as: " + title);
	return true;
	} else {
		System.out.println("Please enter a valid title");
		log.warning("trying to enter invalid employee title: " + title);
		setEmployeeTitle();
		return false;
	}
}
public boolean setEmployeeFirstname(){
	System.out.println("Employee's firstname:  ");
	String fname = scanner.nextLine();
	if(fname != null && !fname.isEmpty()){
		newUser.setFirstName(fname);
		setEmployeeSurname();
		log.info("Employee firstname added as: " + fname);
	return true;
	} else {
		System.out.println("Please enter a valid first name");
		log.warning("trying to enter invalid employee firstname: " + fname);
		setEmployeeFirstname();
		return false;
	}
}
public boolean setEmployeeSurname(){
	System.out.println("Employee's surname:  ");
	String surname = scanner.nextLine();
	if(surname != null && !surname.isEmpty()){
		newUser.setSurName(surname);
		setEmployeeDOB();
		log.info("Employee surname added as: " + surname);
	return true;
	} else {
		System.out.println("Please enter a valid surname");
		log.warning("trying to enter invalid employee surname: " + surname);
		setEmployeeSurname();
		return false;
	}
}
public boolean setEmployeeDOB(){
	System.out.println("Employee's DOB:  ");
	String DOB = scanner.nextLine();
	if(convertDate(DOB)){
		setEmployeeSalary();
		log.info("Employee date of birth added as: " + DOB);
	return true;
	} else {
		System.out.println("Please enter a valid date of birth (DD-MM-YYYY)");
		log.warning("trying to enter invalid date of birth: " + DOB);
		setEmployeeDOB();
		return false;
	}
}
public boolean convertDate(String x){
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	java.util.Date dob = null;
	java.sql.Date sqlDate = null;
	try {
		dob = formatter.parse(x);
		sqlDate = new java.sql.Date(dob.getTime());
		newUser.setDob(sqlDate);
		log.info("Successfully parsed date to sql date: " + x);
		return true;
	} catch (ParseException e) {
		log.warning("Failed to parse date to sql date with error: " + e);
	return false;
	}
}
public boolean setEmployeeSalary(){
	System.out.println("Employee's salary:  ");
	String salary = scanner.nextLine();
	if (salary.matches("[0-9]+") && salary.length() > 0) {
		Double temp = Double.parseDouble(salary);
		newUser.setSalary(temp);
		log.info("Employee salary added as: " + salary);
		employeeIsGood();
	return true;
	} else {
		System.out.println("Please enter a valid salary");
		log.warning("trying to enter invalid salary: " + salary);
		setEmployeeSalary();
		return false;
	}
}
public void employeeIsGood(){
	Util util = new Util();		
		if(util.runAddUserQuery(yup.addUser(), newUser.getDOB(), newUser.getFirstName(), newUser.getsurName(), newUser.getTitle(),(Blob) null,newUser.getSalary())){
			System.out.println("Employee Created");
			log.info("Employee sucessfully added to sql databases");

		} else {
			System.out.println("Could Not Create Employee");
			log.warning("Employee wasn't added to sql database ");
		}
	
}
	public void getEmployeeDetails(){
		System.out.println("Provide the new employee''s details in following: ");
		setEmployeeFirstname();
	}

	public static void main(String[] args) {

	}

}
