package com.chad.app;

/**
 * Created by student on 2016/04/05.
 */
public class Rectangle {

    private int width;
    private int height;

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea()
    {
        return width * height;
    }
}
