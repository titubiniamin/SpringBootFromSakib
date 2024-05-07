package com.mles.tutorial.service;

import com.mles.tutorial.dto.EmployeeDTO;
import com.mles.tutorial.dto.StudentDTO;
import com.mles.tutorial.model.EmployeeModel;
import com.mles.tutorial.model.StudentModel;
import com.mles.tutorial.repo.EmployeeModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeModelRepo employeeModelRepo;

    @Autowired
    public EmployeeService(EmployeeModelRepo employeeModelRepo) {
        this.employeeModelRepo = employeeModelRepo;
    }

    public EmployeeModel employeeStore(EmployeeDTO employeeDTO) {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName(employeeDTO.getName());
        employeeModel.setAddress(employeeDTO.getAddress());
        employeeModel.setEmail(employeeDTO.getEmail());
        employeeModel = employeeModelRepo.saveAndFlush(employeeModel);
        return employeeModel;

    }



}
