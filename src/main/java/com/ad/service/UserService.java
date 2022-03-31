package com.ad.service;

import com.ad.beans.Login;

public interface UserService {
	// Initialize register method and make object of Login class
	int register(Login login);
	
	//validateUser method and make object of login class
	Login validateUser(Login login);
}
