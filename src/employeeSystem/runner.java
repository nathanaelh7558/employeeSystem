package employeeSystem;

import java.util.Scanner;


public class runner {

	public runner() {
	}
	
	
	public void getUserType(){
		String answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of user would you like to log in as? ");
		System.out.println("A: Admin || F: Finance || C: Chris Reid");
		answer = scanner.nextLine();
		answer = answer.toLowerCase();
		
		if(answer.equals("a")){
			//Code here
		}else if(answer.equals("b")){
			//Code here
		}else if(answer.equals("c")){
			//Code here
		}else{
			getUserType();
		}
		
		
		 
		
		

		
		
	}
	

}
