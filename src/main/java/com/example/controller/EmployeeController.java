package com.example.controller;

import com.example.model.Employee;
import com.example.model.EmployeeManager;
import com.example.model.Employees;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();

    }

    @PostMapping("/employees")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {

        Employee created = employeeManager.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);

    }
}
