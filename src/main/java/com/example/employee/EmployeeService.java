package com.example.employee;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class EmployeeService {


    List<Employee> employees = new ArrayList<>();



    public List<Employee> getEmployees(){

        return employees;

    }



    public Employee addEmployee(Employee employee){

        employees.add(employee);

        return employee;

    }


}