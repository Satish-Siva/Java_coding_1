package in.carrer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoConnection {

	public void createConnection() {
	
         Connection con;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String uri ="jdbc:mysql://localhost:3306/test1";
		
			String username="root";
			
	   	String password="root";
	     DriverManager.getConnection(uri, username, password);
		System.out.println("connection sucessfull");
	   }
	    catch (Exception e) {
		System.out.println("connection failed" +e.getMessage());
		System.out.println(e);
		
		
	
	
}
		
		
}
}}