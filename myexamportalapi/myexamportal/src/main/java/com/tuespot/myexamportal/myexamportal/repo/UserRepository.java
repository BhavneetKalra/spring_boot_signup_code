package com.tuespot.myexamportal.myexamportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.myexamportal.myexamportal.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	
	public User findByusername(String UserName);

}
