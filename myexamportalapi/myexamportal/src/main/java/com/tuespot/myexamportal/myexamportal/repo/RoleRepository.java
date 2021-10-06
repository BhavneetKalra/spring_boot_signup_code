package com.tuespot.myexamportal.myexamportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.myexamportal.myexamportal.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	
}
