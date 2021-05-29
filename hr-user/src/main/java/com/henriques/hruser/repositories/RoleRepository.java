package com.henriques.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.henriques.hruser.entities.Role;

@EnableJpaRepositories
public interface RoleRepository extends JpaRepository<Role, Long> {

}
