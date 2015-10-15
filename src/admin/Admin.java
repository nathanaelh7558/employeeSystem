package admin;
import java.sql.Date;
import java.util.Scanner;

import employeeSystem.DBQueries;
import util.Util;


public class Admin {
	
public Admin(){
	
}
	
	public void adminMenu(){
		String answer;
		Scanner scanner = new Scanner(System.in);
		DBQueries yup = new DBQueries();
		System.out.println("What would you like to do? ");
		System.out.println("1: Add employee || 2: Assign employee to project || 3: Update employee || 4: Remove employee");
		answer = scanner.nextLine();
		System.out.println("");
		Util util = new Util();
		if(answer.equals("1")){
			
			Date date = new Date(14, 04, 1995);
			util.runAddUserQuery(yup.addUser(), date, "nat", "holmes", "mr", null,5600.50);
		}else if (answer.equals("2")){
			 java.util.Date utilDate = new java.util.Date();
			    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			    System.out.println("utilDate:" + utilDate);
			    System.out.println("sqlDate:" + sqlDate);
			//Answer is 2
			
		}else if(answer.equals("3")){
			//Answer is 3
		}else if(answer.equals("4")){
			//Answer is 4
		}else{
			
		}
		
	}
	public static void main(String[] args) {


	}

}
