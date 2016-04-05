package com.chad.app;

/**
 * Created by student on 2016/04/04.
 */


public class CowImpl implements Animal{

    public AnimalData getAnimal()
    {
        AnimalData animal = new AnimalData();

        animal.setType("cow");
        animal.setName("Mooly");
        animal.setGender("Female");
        animal.setColour("Black and White");

        return animal;
    }

}
