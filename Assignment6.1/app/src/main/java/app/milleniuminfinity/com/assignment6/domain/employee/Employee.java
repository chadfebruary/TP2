package app.milleniuminfinity.com.assignment6.domain.employee;

import java.util.Date;
import java.io.Serializable;

/**
 * Created by 208023429 on 4/14/2016.
 */
public class Employee implements Serializable{
    private String name, surname;
    private Date dateOfBirth;
    private int employeeID;

    private Employee(){}

    private Employee(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.dateOfBirth = builder.dateOfBirth;
        this.employeeID = builder.employeeID;
    }



    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public static class Builder
    {
        private String name, surname;
        Date dateOfBirth;
        int employeeID;


        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }

        public Builder dateOfBirth(Date value)
        {
            this.dateOfBirth = value;
            return this;
        }

        public Builder employeeID(int value)
        {
            this.employeeID = value;
            return this;
        }

        public Builder copy(Employee value)
        {
            this.name = value.getName();
            this.surname = value.getSurname();
            this.dateOfBirth = value.getDateOfBirth();
            this.employeeID = value.getEmployeeID();

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }

}
