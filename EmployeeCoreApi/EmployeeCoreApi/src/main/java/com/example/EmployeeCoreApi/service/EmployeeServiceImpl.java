package com.example.EmployeeCoreApi.service;

import com.example.EmployeeCoreApi.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final HashMap<String, EmployeeModel> employeeMap = new HashMap<>();
    static {
        EmployeeModel employeeModel1 = new EmployeeModel(UUID.randomUUID().toString(), "Ivam", "Urgant", "Parasattylyq", "manager", "iUrgant@gmail.com", 20000);
        EmployeeModel employeeModel2 = new EmployeeModel(UUID.randomUUID().toString(), "Andrey", "Lekson", "Parasattylyq", "soft-engineer", "lekson12@gmail.com", 15000);
        EmployeeModel employeeModel3 = new EmployeeModel(UUID.randomUUID().toString(), "Dmitriy", "Ksenov", "Parasattylyq", "mobile developer", "ksenovD@gmail.com", 22000);
        employeeMap.put(employeeModel1.getEmployeeId(), employeeModel1);
        employeeMap.put(employeeModel2.getEmployeeId(), employeeModel2);
        employeeMap.put(employeeModel2.getEmployeeId(), employeeModel3);
    }

    @Override
    public void createNewEmployee(EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(UUID.randomUUID().toString());
        employeeMap.put(employeeModel.getEmployeeId(), employeeModel);
    }

    @Override
    public List<EmployeeModel> getAllEmployee() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public EmployeeModel getEmployeeById(String employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public void updateEmployeeById(String employeeId, EmployeeModel employeeModel) {
        employeeModel.setEmployeeId(employeeId);
        employeeMap.put(employeeId, employeeModel);
    }

    @Override
    public void deleteEmployeeById(String employeeId) {
        employeeMap.remove(employeeId);
    }
}
