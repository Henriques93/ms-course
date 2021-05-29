package com.henriques.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.henriques.hruser.entities.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
