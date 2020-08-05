package com.practice.user_demoPractice_jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String DRIVER ="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/pk_demo_db";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}

}
