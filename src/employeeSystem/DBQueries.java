package employeeSystem;

public class DBQueries {

	public DBQueries() {
		// TODO Auto-generated constructor stub
	}
	public String addUser(){
		String query = "CALL insertEmployee(?,?,?,?,?,?);";
		return query;
	}

}
