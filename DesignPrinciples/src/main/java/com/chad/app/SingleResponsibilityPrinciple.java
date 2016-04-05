package com.chad.app;

/**
 * Created by student on 2016/04/04.
 */
public class SingleResponsibilityPrinciple {

    int num1, num2;
    String name;

    public int add(int num1, int num2)
    {
        return (num1 + num2);
    }

    public int subtract(int num1, int num2)
    {
        return (num1 - num2);
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
}
