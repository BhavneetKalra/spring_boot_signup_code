package com.tuespot.myexamportal.myexamportal.controller;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.myexamportal.myexamportal.model.Role;
import com.tuespot.myexamportal.myexamportal.model.User;
import com.tuespot.myexamportal.myexamportal.model.UserRole;
import com.tuespot.myexamportal.myexamportal.servive.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//Creating User
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception
	{
		
		user.setProfile("default.jpg");
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		
		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleId(45L);
		role.setRollName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
		
	}
	
	//get user 
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
		
	}
	
	
	//Delete User by Id
	@DeleteMapping("/{userid}")
	public void delUser(@PathVariable("userid") Long userid) {
		this.userService.deleteUserBid(userid);
	}

}
