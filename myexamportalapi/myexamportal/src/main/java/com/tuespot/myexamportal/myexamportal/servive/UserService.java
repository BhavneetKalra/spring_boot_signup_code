package com.tuespot.myexamportal.myexamportal.servive;


import java.util.Set;

import com.tuespot.myexamportal.myexamportal.model.User;
import com.tuespot.myexamportal.myexamportal.model.UserRole;

public interface UserService {
	
	
	//create user
	public User createUser(User user, Set<UserRole> userRoles ) throws Exception;
	
	//get user by name
	public User getUser(String username);
	
	//delete user by id
	public void deleteUserBid(Long id);

}
