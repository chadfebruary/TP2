package app.milleniuminfinity.com.assignment6.domain.employee;

import java.util.Date;

/**
 * Created by 208023429 on 4/14/2016.
 */
public interface Person {

  Employee getEmployee(String name, String surname, Date dateOfBirth, int employeeID);
  
}
