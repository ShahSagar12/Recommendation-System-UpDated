package com.event.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnector {
	public static Connection connectToDB() {
		Connection connection=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
		
		
		}catch(Exception exp) {
			System.out.println("Error"+exp);
		}
		
		return connection;
	}

	
}
