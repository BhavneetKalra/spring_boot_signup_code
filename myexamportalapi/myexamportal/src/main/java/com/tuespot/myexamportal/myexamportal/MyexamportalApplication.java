package com.tuespot.myexamportal.myexamportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tuespot.myexamportal.myexamportal.model.Role;
import com.tuespot.myexamportal.myexamportal.model.User;
import com.tuespot.myexamportal.myexamportal.model.UserRole;
import com.tuespot.myexamportal.myexamportal.repo.UserRepository;
import com.tuespot.myexamportal.myexamportal.servive.UserService;

@SpringBootApplication
public class MyexamportalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyexamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Starting Code");
		
//		User user = new User();
//		
//		user.setFirstname("Bhavneet");
//		user.setLastname("Singh");
//		user.setUsername("bhavneet2000");
//		user.setEmail("bhavneetkalra2000@gmail.com");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//		user.setPhone("9501306267");
//	
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRollName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		
//		System.out.println(user1.getUsername());
//		 
		
	}

}
