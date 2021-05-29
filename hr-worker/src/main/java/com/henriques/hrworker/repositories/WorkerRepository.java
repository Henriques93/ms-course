package com.henriques.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriques.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
