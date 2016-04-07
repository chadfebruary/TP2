package com.chad.app.domain;

import java.util.Date;

/**
 * Created by student on 2016/04/07.
 */
public class Employee implements Person{

    private String name, surname;
    private int dateOfBirth;
    private int employeeID;

    public Employee()
    {

    }

    public Employee(Builder builder)
    {
        this.setName(builder.name);
        this.setSurname(builder.surname);
        this.setDateOfBirth(builder.dateOfBirth);
        this.setEmployeeID(builder.employeeID);
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }

    public void setDateOfBirth(int dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public int getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }
    public int getEmployeeID()
    {
        return employeeID;
    }

    public static class Builder
    {
        private String name, surname;
        int dateOfBirth;
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

        public Builder dateOfBirth(int value)
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
