package com.nald.service;

import com.nald.model.UserAuth;

public class UserRepo {
	public Boolean authenticateUser(UserAuth user) {
		if(user.getUsername().equals("donald") && user.getPassword().equals("123456")) {
			return true;
		}
		else {
			return false;
		}
	}
}
