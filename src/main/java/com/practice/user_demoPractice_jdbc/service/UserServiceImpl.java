package com.practice.user_demoPractice_jdbc.service;

import java.util.List;

import com.practice.user_demoPractice_jdbc.dao.UserDao;
import com.practice.user_demoPractice_jdbc.dao.UserDaoImpl1;
import com.practice.user_demoPractice_jdbc.model.User;

public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl1();
	@Override
	public int saveUserInfo(User user) {
	
		return userDao.saveUserInfo(user);
	}

	@Override
	public int updateUserInfo(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserInfo(user);
	}

	@Override
	public void delteUserInfo(int id) {
		userDao.delteUserInfo(id);

	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return userDao.getAllUserInfo();
	}

}
