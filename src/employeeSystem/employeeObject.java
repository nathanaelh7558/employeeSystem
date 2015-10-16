package employeeSystem;

import java.sql.Date;
import java.util.logging.Logger;

public class employeeObject {
	private String firstName;
	private String surName;
	private int employeeID;
	private String title;
	private Double salary;
	private Date DOB;
	protected static Logger log = Logger.getLogger(employeeObject.class.getName());

	//Overloaded constructor
	public employeeObject() {
		
	}
	public employeeObject(String firstName) {
		setFirstName(firstName);
	}
	
	public employeeObject(String firstName, String surName){
		this(firstName);
		setSurName(surName);
	}
	
	public employeeObject(String firstName, String surName, String title){
		this(firstName, surName);
		setTitle(title);
	}
	
	public employeeObject(String firstName, String surName, String title, Double salary){
		this(firstName, surName, title);
		setSalary(salary);
	}
	
	public employeeObject(String firstName, String surName,  String title, Double salary, Date DOB){
		this(firstName, surName, title, salary);
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
	
	public Double getSalary(){
		return this.salary;
	}
	
	public Date getDOB(){
		return this.DOB;
	}
	
	//Setters
	
	public void setFirstName(String firstName){
		log.info("Employee firstname added as: " + firstName);
		this.firstName = firstName;
	}
	
	public void setSurName(String surName){
		log.info("Employee surname added as: " + surName);
		this.surName = surName;
	}
	
	public void setEmployeeID(int id){
		log.info("Employee Id added as: " + employeeID);
		this.employeeID = id;
	}
	
	public void setTitle(String title){
		log.info("Employee title added as: " + title);
		this.title = title;
	}
	
	public void setSalary(Double salary){
		log.info("Employee salary added as: " + salary);
		this.salary = salary;
	}
	
	public void setDob(Date dob){
		log.info("Employee Date of Birth added as: " + dob);
		this.DOB = dob;
	}
	

}
