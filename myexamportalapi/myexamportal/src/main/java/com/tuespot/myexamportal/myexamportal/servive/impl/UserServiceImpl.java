package com.tuespot.myexamportal.myexamportal.servive.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.myexamportal.myexamportal.model.User;
import com.tuespot.myexamportal.myexamportal.model.UserRole;
import com.tuespot.myexamportal.myexamportal.repo.RoleRepository;
import com.tuespot.myexamportal.myexamportal.repo.UserRepository;
import com.tuespot.myexamportal.myexamportal.servive.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	//creating user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		
	User local = this.userRepository.findByusername(user.getUsername());
	 if(local != null) {
		 System.out.println("User is already there !!");
		 throw new Exception("User already present !!");
	 }else {
		 //create user
		 
		 for(UserRole ur:userRoles) {
			 roleRepository.save(ur.getRole());
		 }
		 
		 user.getUserRoles().addAll(userRoles);
		 local = this.userRepository.save(user);
		 
	 }
		
		return local;
	}


	


	// get user by id
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByusername(username);
	}




	//delete user by id
	@Override
	public void deleteUserBid(Long id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
		
	}
	
}
