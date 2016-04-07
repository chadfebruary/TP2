package com.chad.app;

import com.chad.app.Impl.CowImpl;
import com.chad.app.Impl.HorseImpl;
import com.chad.app.Impl.SheepImpl;

import java.util.*;

/**
 * Created by student on 2016/04/07.
 */
public class RunExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<CowImpl> cowList = new ArrayList();
        Set<HorseImpl> horseSet = new HashSet();
        Map<String, SheepImpl> sheepMap = new HashMap();

        CowImpl cow = new CowImpl();
        cow.getAnimal();



    }

}
