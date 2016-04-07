package com.chad.app.Impl;

import com.chad.app.Animal;
import com.chad.app.AnimalData;

/**
 * Created by student on 2016/04/07.
 */
public class SheepImpl implements Animal {

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