package com.chad.app;

/**
 * Created by student on 2016/04/04.
 */


public class SheepImpl implements Animal{

    public AnimalData getAnimal()
    {
        AnimalData animal = new AnimalData();
        animal.setType("sheep");
        animal.setName("Billy");
        animal.setGender("Male");
        animal.setColour("White");

        return animal;
    }

}
