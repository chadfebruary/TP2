package com.chad.app.domain;

/**
 * Created by student on 2016/04/07.
 */
public class SecurityGuard extends Employee{

    //    private int employeeID;
//
//    public SecurityGuard(Builder builder)
//    {
//        this.setName(builder.name);
//        this.setSurname(builder.surname);
//        this.setDateOfBirth(builder.dateOfBirth);
//        this.setEmployeeID(builder.employeeID);
//    }
//
//    @Override
//    public void setEmployeeID(int employeeID)
//    {
//        this.employeeID = employeeID;
//    }
//
//    @Override
//    public int getEmployeeID()
//    {
//        return employeeID;
//    }
//
    public int guard()
    {
        return 0;
    }

//    public static class Builder
//    {
//        private String name, surname;
//        Date dateOfBirth;
//        int employeeID;
//
//
//        public Builder name(String value)
//        {
//            this.name = value;
//            return this;
//        }
//
//        public Builder surname(String value)
//        {
//            this.surname = value;
//            return this;
//        }
//
//        public Builder dateOfBirth(Date value)
//        {
//            this.dateOfBirth = value;
//            return this;
//        }
//
//        public Builder employeeID(int value)
//        {
//            this.employeeID = value;
//            return this;
//        }
//
//        public Builder copy(SecurityGuard value)
//        {
//            this.name = value.getName();
//            this.surname = value.getSurname();
//            this.dateOfBirth = value.getDateOfBirth();
//            this.employeeID = value.getEmployeeID();
//
//            return this;
//        }
//
//        public SecurityGuard build()
//        {
//            return new SecurityGuard(this);
//        }
//    }

}

