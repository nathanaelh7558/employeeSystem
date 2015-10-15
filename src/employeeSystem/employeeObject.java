package employeeSystem;

import java.util.Date;

public class employeeObject {
	private String firstName;
	private String surName;
	private int employeeID;
	private String title;
	private float salary;
	private Date DOB;
	
	//Overloaded constructor
	public employeeObject(String firstName) {
		setFirstName(firstName);
	}
	
	public employeeObject(String firstName, String surName){
		this(firstName);
		setSurName(surName);
	}
	
	
	public employeeObject(String firstName, String surName, int employee_id){
		this(firstName, surName);
		setEmployeeID(employee_id);
	}
	
	public employeeObject(String firstName, String surName, int employee_id, String title){
		this(firstName, surName, employee_id);
		setTitle(title);
	}
	
	public employeeObject(String firstName, String surName, int employee_id, String title, float salary){
		this(firstName, surName, employee_id, title);
		setSalary(salary);
	}
	
	public employeeObject(String firstName, String surName, int employee_id, String title, float salary, Date DOB){
		this(firstName, surName, employee_id, title, salary);
		setDob(DOB);
	}
	
	//Getters
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getsurName(){
		return this.surName;
	}
	
	public int getEmployeeID(){
		return this.employeeID;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public float getSalary(){
		return this.salary;
	}
	
	public Date getDOB(){
		return this.DOB;
	}
	
	//Setters
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setSurName(String surName){
		this.surName = surName;
	}
	
	public void setEmployeeID(int id){
		this.employeeID = id;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setSalary(float salary){
		this.salary = salary;
	}
	
	public void setDob(Date dob){
		this.DOB = dob;
	}
	

}
