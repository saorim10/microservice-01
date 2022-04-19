package com.msaorim.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msaorim.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
