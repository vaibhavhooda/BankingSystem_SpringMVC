package com.ad.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ad.beans.Login;
import com.ad.dao.UserDao;


public class UserServiceImpl implements UserService {
	
	@Autowired
	// object of Dao class which will be inject from spring-servlet file
	public UserDao userDao;

	// register method
	public int register(Login login) {
		return userDao.register(login);
	}

	//validate method for login
	public Login validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
