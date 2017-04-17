// Insert Data From mySQL Database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDriver {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/Database";
		String user="root";
		String password="root";

		try{
			//1. Get a connection to datatbase
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt =myConn.createStatement();
			
			//3. Execute SQL query
			String sql= "INSERT INTO `Database`.`EmployeeInfo`" 
					+"(`idEmployeeInfo`, `name`, `surname`, `age`)"
					+"VALUES ('5', 'Kathy', 'Xiong', '19')";
			myStmt.executeUpdate(sql);
			System.out.println("Insert Complete.");
		}catch(Exception exc){
		   
		    exc.printStackTrace();
	}

 }
}
