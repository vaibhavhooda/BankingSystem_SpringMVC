package com.ad.dao;

import com.ad.beans.Login;

public interface UserDao {

	//register method and referring User class and making its object
	int register(Login login);

	//validate user i.e. login object
	Login validateUser(Login login);
}

