package employeeSystem;

public class DBQueries {

	public DBQueries() {
		// TODO Auto-generated constructor stub
	}
	public String addUser(){
		String query = "CALL insertEmployee(?,?,?,?,?,?);";
		return query;
	}
	public String removeUser(){
		String query = "CALL removeEmployee(?);";
		return query;
	}
	public String updateUser(){
		String query = "CALL updateEmployee(?,?,?,?,?,?,?);";
		return query;
	}
}
