package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con = null;
	static 
	{
		String url = "jdbc:mysql://localhost/tfms";
		String user = "root";
		String pass = "Admin";
		try {
			con = DriverManager.getConnection(url, user, pass);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

public static Connection getConnection()
{
	return con;
}
}
