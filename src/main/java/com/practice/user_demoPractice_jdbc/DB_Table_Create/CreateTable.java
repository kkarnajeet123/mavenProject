package com.practice.user_demoPractice_jdbc.DB_Table_Create;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

import com.practice.user_demoPractice_jdbc.util.DbUtil;
import com.practice.user_demoPractice_jdbc.util.QueryUtil;

public class CreateTable {

	public static void main(String[] args) {
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.CREATE_TABLE);
				){
			
			ps.executeUpdate();
			System.out.println("Table Created");
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		} 

	}

}
