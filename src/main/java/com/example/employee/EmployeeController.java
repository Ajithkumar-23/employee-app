package com.example.employee;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/employees")
public class EmployeeController {



    @Autowired
    EmployeeService service;



    @GetMapping
    public List<Employee> getEmployees(){

        return service.getEmployees();

    }




    @PostMapping
    public Employee addEmployee(
            @RequestBody Employee employee){

        return service.addEmployee(employee);

    }

}