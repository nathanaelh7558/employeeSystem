package admin;
import java.util.Scanner;
import util.Util;


public class Admin {
	Util util = new Util();

	
	public void adminMenu(){
		String answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like to do? ");
		System.out.println("1: Add employee || 2: Assign employee to project || 3: Update employee || 4: Remove employee");
		answer = scanner.nextLine();
		System.out.println("");
		if(answer.equals("1")){
			//Answer is 1
		}else if (answer.equals("2")){
			//Answer is 2
			
		}else if(answer.equals("3")){
			//Answer is 3
		}else if(answer.equals("4")){
			//Answer is 4
		}else{
			
		}

		
		
		
		
	}
	

}
