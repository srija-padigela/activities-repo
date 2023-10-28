package com.npci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // Add any validation or business logic here
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        // Add any validation or business logic here
        return employeeDao.save(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeDao.deleteById(employeeId);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeDao.findById(employeeId).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }
}
