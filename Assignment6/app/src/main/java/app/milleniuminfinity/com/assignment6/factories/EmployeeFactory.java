package app.milleniuminfinity.com.assignment6.factories;

/**
 * Created by Admin on 2016/04/15.
 */
import java.util.Date;

import app.milleniuminfinity.com.assignment6.domain.employee.Cleaner;
import app.milleniuminfinity.com.assignment6.domain.employee.Employee;
import app.milleniuminfinity.com.assignment6.domain.employee.SalesRepresentative;
import app.milleniuminfinity.com.assignment6.domain.employee.SecurityGuard;

public class EmployeeFactory {

    private static EmployeeFactory factory = null;

    public static void getInstance(String type, String name, String surname, Date dateOfBirth, int employeeID)
    {
        Employee employee;
        
        if(type.equals("Sales representative"))
        {
            SalesRepresentative salesRep = new SalesRepresentative();
            
            salesRep.getEmployee(name, surname, dateOfBirth, employeeID);
            
        }
        else if(type.equals("Cleaner"))
        {
            Cleaner cleaner = new Cleaner();;
            
            cleaner.getEmployee(name, surname, dateOfBirth, employeeID);
        }
        else
        {
            SecurityGuard securityGuard = new SecurityGuard();
            
            securityGuard.getEmployee(name, surname, dateOfBirth, employeeID);
        }   
    }
}
