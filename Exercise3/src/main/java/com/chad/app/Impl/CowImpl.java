package com.chad.app.Impl;

import com.chad.app.Animal;
import com.chad.app.AnimalData;

/**
 * Created by student on 2016/04/07.
 */
public class CowImpl implements Animal {

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
