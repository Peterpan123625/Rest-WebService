package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private final List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        employees.add(new Employee(
                "1", "Jane", "Street", "jane.street@email.com", "Teacher"));
        employees.add(new Employee(
                "2", "John", "Doe", "john.doe@email.com", "Engineer"));
        employees.add(new Employee(
                "3", "Alice", "Brown", "alice.brown@email.com", "Manager"));
    }

    public Employees getEmployees() {
        return new Employees(employees);
    }

    public Employee addEmployee(Employee employee) {

        employees.add(employee);
        return employee;
    }
}
