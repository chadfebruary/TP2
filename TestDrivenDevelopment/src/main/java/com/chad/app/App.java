package com.chad.app;


public class App 
{
    public float floatingPoint()
    {
        return (float) 1.5;
    }

    public int integer()
    {
        return 1;
    }

    public App objectEquality()
    {
        return this;
    }

    public App objectIdentity()
    {
        return this;
    }

    public int truth()
    {
        return 1;
    }

    public int falseTest()
    {
        return 1;
    }

    public String nullTest()
    {
        return null;
    }

    public String nonNull()
    {
        return "Non null";
    }

    public String failingTest()
    {
        return "Failing test";
    }

    public int exceptionTest(){
        int [] array = {1, 2, 3};

        return array[3];
    }

    public void timeout(){

        for(int i = 0; i < 1; i++)
        {
            int num = 1;
        }
    }

    public int[] array(){
        int[] array = {1, 2, 3};

        return array;
    }
}
