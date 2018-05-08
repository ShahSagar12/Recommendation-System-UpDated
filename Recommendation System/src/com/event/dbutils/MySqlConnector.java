package com.event.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnector {
	public static Connection connectToDB() {
		Connection connection=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
		System.out.println("Database Connected");
		
		}catch(Exception exp) {
			System.out.println("Error"+exp);
		}
		
		return connection;
	}

	public static void main(String[] args) {
		connectToDB();
		

	}
}
