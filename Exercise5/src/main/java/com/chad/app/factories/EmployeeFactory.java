package com.chad.app.factories;

import com.chad.app.domain.Employee;

/**
 * Created by student on 2016/04/07.
 */
public interface EmployeeFactory {

    public Employee.Builder createEmployee(String name, String surname, int dateOfBirth, int employeeID);

}