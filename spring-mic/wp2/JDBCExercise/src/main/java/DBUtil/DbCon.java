package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	static Connection con;
	
	public static Connection getConnection() throws SQLException {
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		System.out.println(con);
		return con;
	}
	
	
	

}
