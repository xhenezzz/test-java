package com.example.EmployeeCoreApi.controller;

import com.example.EmployeeCoreApi.model.EmployeeModel;
import com.example.EmployeeCoreApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> createNewEmployee(@Valid @RequestBody EmployeeModel employeeModel){
        employeeService.createNewEmployee(employeeModel);
        return new ResponseEntity<String>("Successful created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<EmployeeModel> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{employeeId}")
    public EmployeeModel getEmployeeById(@PathVariable String employeeId){
        return employeeService.getEmployeeById(employeeId);
    }


    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployeeById(@PathVariable String employeeId, @Valid @RequestBody EmployeeModel employeeModel){
        employeeService.updateEmployeeById(employeeId, employeeModel);
        return new ResponseEntity<String>("Successful updated", HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable String employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return new ResponseEntity<String>("Successful deleted", HttpStatus.OK);
    }

}
