package employeeSystem;
import admin.Admin;
import finance.Finance;
import chrisReid.ChrisReid;
import util.Util;

import java.util.Scanner;


public class runner {
	Util util = new Util();
	Admin admin = new Admin();

	public runner() {
	}
	
	public void getUserType(){
		String answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of user would you like to log in as? ");
		System.out.println("1: Admin || 2: Finance || 3: Chris Reid");
		answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			admin.adminMenu();
		}else if(answer.equals("2")){
			//Calls finance class
		}else if(answer.equals("3")){
			//Calls chris class
		}else{
			getUserType(); //Repeats 
		}	
	}
	

}
