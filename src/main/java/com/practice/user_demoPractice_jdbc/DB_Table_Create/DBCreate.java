package com.practice.user_demoPractice_jdbc.DB_Table_Create;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.practice.user_demoPractice_jdbc.util.DbUtil;
//import com.practice.user_demoPractice_jdbc.util.QueryUtil;

public class DBCreate {

	public static void main(String[] args) {
		
		String sql ="create database pk_demo_db";
		try(
				Connection con = DbUtil.getConnection();
				Statement ps = con.createStatement();
				){
			
			ps.executeUpdate(sql);
			System.out.println("Database Created");
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		} 

	}

}
