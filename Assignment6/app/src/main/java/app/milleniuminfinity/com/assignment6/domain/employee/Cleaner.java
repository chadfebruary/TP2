package app.milleniuminfinity.com.assignment6.domain.employee;

/**
 * Created by 208023429 on 4/14/2016.
 */
import java.util.Date;

public class Cleaner implements Person {

    @Override
    public Employee getEmployee(String name, String surname, Date dateOfBirth, int employeeID) {

        Employee employee = new Employee.Builder()
                                .name(name)
                                .surname(surname)
                                .dateOfBirth(dateOfBirth)
                                .employeeID(employeeID)
                                .build();

        return employee;
    }
    
    public String getEmployeeRole()
    {
        return "Cleaner.";
    }
}
