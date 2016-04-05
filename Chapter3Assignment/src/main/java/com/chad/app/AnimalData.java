package com.chad.app;


import java.io.Serializable;


public class AnimalData  implements Serializable{

    String type;
    String name;
    String colour;
    String gender;
    int age;

    public void setType(String type)
    {
        this.type = type;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public String getColour()
    {
        return colour;
    }

    public String getGender()
    {
        return gender;
    }

    public String toString()
    {
        return ("Type: " + type + "\nName: " + name + "\nColour: " + "\nGender: " + gender + "\nAge: " + age);
    }

}
