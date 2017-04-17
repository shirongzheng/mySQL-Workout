// Show Data From mySQL Database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowDriver {

	public static void main(String[] args){
		
		try{
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database","root","root");
		    //2. Create a statement
			Statement myStmt = myConn.createStatement();
		    //3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM `Database`.EmployeeInfo");
		    //4. Process the result set
		    while(myRs.next()){
		    	System.out.println(myRs.getString("name")+","+myRs.getString("surname"));
		    }
		}catch(Exception exc){
		   
		    exc.printStackTrace();
		}
	}
}
