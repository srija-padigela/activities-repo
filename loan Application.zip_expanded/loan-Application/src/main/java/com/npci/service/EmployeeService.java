package com.npci.service;

import java.util.List;

import com.npci.beans.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long employeeId);
    Employee getEmployeeById(Long employeeId);
    List<Employee> getAllEmployees();
}
