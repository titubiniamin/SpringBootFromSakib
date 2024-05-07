package com.mles.tutorial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mles.tutorial.model.EmployeeModel;


public interface EmployeeModelRepo extends JpaRepository<EmployeeModel, Long> {

}
