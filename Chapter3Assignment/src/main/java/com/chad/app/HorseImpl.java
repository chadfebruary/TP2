package com.chad.app;

/**
 * Created by student on 2016/04/04.
 */


public class HorseImpl implements Animal{

    public AnimalData getAnimal()
    {
        AnimalData animal = new AnimalData();

        animal.setType("horse");
        animal.setName("Seabiscuit");
        animal.setGender("Male");
        animal.setColour("Brown");

        return animal;
    }

}
