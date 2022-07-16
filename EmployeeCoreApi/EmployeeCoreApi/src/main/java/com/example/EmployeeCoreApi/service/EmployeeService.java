package com.example.EmployeeCoreApi.service;

import com.example.EmployeeCoreApi.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    void createNewEmployee(EmployeeModel employeeModel);
    List<EmployeeModel> getAllEmployee();
    EmployeeModel getEmployeeById(String employeeId);
    void updateEmployeeById(String employeeId, EmployeeModel employeeModel);
    void deleteEmployeeById(String employeeId);
}
