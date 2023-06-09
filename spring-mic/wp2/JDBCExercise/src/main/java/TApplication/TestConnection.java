package TApplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DBUtil.DbCon;

public class TestConnection {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DbCon.getConnection();
		
		Statement st = con.createStatement();
		
		
		
		System.out.println(con);
	}

}
