package com.nald;

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
