package employeeSystem;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.sql.rowset.serial.SerialException;

import admin.Admin;
import employeeSystem.runner;

public class Main {

	public Main() {
		
	}
	static Logger log = Logger.getLogger("");
	private static void setupLog(){
		try {
			Handler h = new FileHandler("%h/workspace/MYLOG.log", 100000, 5, true);
			h.setFormatter(new SimpleFormatter());
			log.addHandler(h);
		
		} catch (IOException e) {
			System.err.println("IOException opening log file: " +e);
		}
	}
	public static void main(String[] args) throws SerialException, SQLException, ParseException {
setupLog();
		runner run = new runner();
		run.getLoginDetails();
		


	}

}
