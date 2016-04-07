package com.chad.app.factories;

import com.chad.app.domain.Employee;

/**
 * Created by student on 2016/04/07.
 */
public class EmployeeFactoryImpl implements EmployeeFactory {

    private static EmployeeFactoryImpl factory = null;

    public static EmployeeFactoryImpl getInstance()
    {
        if(factory == null)
            factory = new EmployeeFactoryImpl();
        return factory;
    }

    public Employee.Builder createEmployee(String name, String surname, int dateOfBirth, int employeeID)
    {
        Employee employee = new Employee
                .Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID);

        return employee;
    }
}
