package com.backend.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
