package com.chad.app.Impl;

import com.chad.app.Animal;
import com.chad.app.AnimalData;

/**
 * Created by student on 2016/04/07.
 */
public class HorseImpl implements Animal {

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
