package admin;
import java.sql.Date;
import java.util.Scanner;
import util.Util;



public class Admin {
	Util util = new Util();
	Scanner scanner = new Scanner(System.in);
	

	
	public void adminMenu(){
		String answer;
		System.out.println("What would you like to do? ");
		System.out.println("1: Add employee || 2: Assign employee to project || 3: Update employee || 4: Remove employee");
		answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			getEmployeeDetails();
		}else if (answer.equals("2")){
			//Answer is 2
		}else if(answer.equals("3")){
			//Answer is 3
		}else if(answer.equals("4")){
			//Answer is 4
		}else{
			
		}	
	}
	
	public void getEmployeeDetails(){
		//Initialize variables 
		String firstName, surname, title, picture, tempDOB;
		Float salary;	
		Date DOB;
		//Outputs helper text
		System.out.println("Provide the new employee's details in following: ");
		//Get title
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
		DOB = util.convertDate(tempDOB); //Converts string to date
		//Get salary
		System.out.print("Employee's salary: ");
		salary = scanner.nextFloat();
	}
	

}
