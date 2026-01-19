package com.example.model;

import java.util.List;

public class Employees {

    private List<Employee> Employees;

    public Employees() {
    }

    public Employees(List<Employee> employees) {
        this.Employees = employees;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;

    }
}
