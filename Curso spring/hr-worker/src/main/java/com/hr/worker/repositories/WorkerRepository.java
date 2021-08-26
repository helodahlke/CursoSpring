package com.hr.worker.repositories;

import com.hr.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
