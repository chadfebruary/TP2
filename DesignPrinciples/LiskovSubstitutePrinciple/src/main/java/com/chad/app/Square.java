package com.chad.app;

/**
 * Created by student on 2016/04/05.
 */
public class Square extends Rectangle{

    public void setHeight(int value)
    {
        this.setWidth(value);
        this.setHeight(value);
    }

    public void setWidth(int value)
    {
        this.setWidth(value);
        this.setHeight(value);
    }
}
