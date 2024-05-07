package com.mles.tutorial.controller;

import com.mles.tutorial.dto.EmployeeDTO;
import com.mles.tutorial.dto.StoreInfoDTO;
import com.mles.tutorial.model.EmployeeModel;
import com.mles.tutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("employee/store")
    public EmployeeModel employeeStore(EmployeeDTO employeeDTO) {
        //this method will return EmployeeModel type
        EmployeeModel message= employeeService.employeeStore(employeeDTO);
//        employeeDTO = employeeDTO.employeeStore(employeeDTO);
        return message;
    }




}
