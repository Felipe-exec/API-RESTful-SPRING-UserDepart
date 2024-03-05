package com.devfullstack.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfullstack.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
