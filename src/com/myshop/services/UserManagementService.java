package com.myshop.services;

import com.myshop.entities.User;

public interface UserManagementService {

String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
