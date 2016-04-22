package app.milleniuminfinity.com.assignment6;
/**
 * Write a description of class TestEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import org.junit.Test;

import app.milleniuminfinity.com.assignment6.factories.employee.EmployeeFactory;

public class TestEmployee
{
    @Test
    public void testEmployeeFactory() throws Exception
    {
        EmployeeFactory employeeFactoryObject = new EmployeeFactory();
       // Employee employeeObject = employeeFactoryObject.getInstance("Cleaner", "Chad", "February", 12/12/2000, 0000);
    }
}
