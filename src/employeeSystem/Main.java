package employeeSystem;
import java.sql.SQLException;
import java.text.ParseException;

import javax.sql.rowset.serial.SerialException;

import admin.Admin;
import employeeSystem.runner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) throws SerialException, SQLException, ParseException {

		runner run = new runner();
		run.getLoginDetails();
		


	}

}
