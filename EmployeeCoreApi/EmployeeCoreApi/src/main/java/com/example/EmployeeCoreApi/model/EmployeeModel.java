package com.example.EmployeeCoreApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmployeeModel {
    private String employeeId;
    private String name;
    @NotNull(message = "name can not be empty")
    private String surname;
    @NotNull(message = "name can not be empty")
    @Size(min = 2, max = 16, message = "surname can not be empty ")
    private String company;
    private String position;
    private String email;
    @Email(message = "incorrect email")
    private double salary;

}
