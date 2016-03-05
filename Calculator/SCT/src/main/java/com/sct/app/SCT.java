package com.sct.app;

public class SCT {

    float hypotenuse = (float) 4.9;
    float adjacent = (float) 4.0;
    float opposite = (float) 2.8;

    public String sin(){

        return String.format("%.2f", opposite / hypotenuse);
    }

    public String cos(){

        return String.format("%.2f", adjacent / hypotenuse);
    }

    public String tan(){

        return String.format("%.2f", opposite / adjacent);
    }
}
