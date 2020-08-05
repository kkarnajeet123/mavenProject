package com.practice.user_demoPractice_jdbc.service;

import java.util.List;

import com.practice.user_demoPractice_jdbc.model.User;

public interface UserService {
	int saveUserInfo(User user);
	int updateUserInfo(User user);
	void delteUserInfo(int id);
	User getUserById (int id);
	List<User> getAllUserInfo();
	
}
