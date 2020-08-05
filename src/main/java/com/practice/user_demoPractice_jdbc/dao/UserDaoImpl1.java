package com.practice.user_demoPractice_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.practice.user_demoPractice_jdbc.model.User;
import com.practice.user_demoPractice_jdbc.util.DbUtil;
import com.practice.user_demoPractice_jdbc.util.QueryUtil;


public class UserDaoImpl1 implements UserDao {
	public int saveUserInfo(User user) {

		int saved =0;
		
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL);
				){
					ps.setString(1, user.getUsername());
					ps.setString(2, user.getPassword());
					ps.setString(3, user.getAddress());
					ps.setLong(4, user.getMobileNum());
					
					
					saved = ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return saved;

	}

	public int updateUserInfo(User user) {
	int update =0;
		
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL);
				){
					ps.setString(1, user.getUsername());
					ps.setString(2, user.getPassword());
					ps.setLong(3, user.getMobileNum());
					ps.setString(4, user.getAddress());
					ps.setInt(5,  user.getId());
					
					update = ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return update;

	}

	public void delteUserInfo(int id) {
		
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.DELETE_SQL);
				){
					ps.setInt(1, id);
					ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

	public User getUserById(int id) {
		
		User user = new User();
		
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL);
				){
					ps.setInt(1, id);
					ResultSet rs= ps.executeQuery();
					
					if(rs.next()) {
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("user_name"));
						user.setPassword(rs.getString("password"));
						user.setAddress(rs.getString("address"));
						user.setMobileNum(rs.getLong("mobile_num"));
						
					}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return user;
	}

	public List<User> getAllUserInfo() {
		
		List<User> userList = new ArrayList<>();
	
		try(
				Connection con = DbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL);
				){
					
					ResultSet rs= ps.executeQuery();
					
					while(rs.next()) {
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("user_name"));
						user.setPassword(rs.getString("password"));
						user.setAddress(rs.getString("address"));
						user.setMobileNum(rs.getLong("mobile_num"));
						userList.add(user);
					}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return userList;
	}

}
