package com.chad.app;

/**
 * Created by student on 2016/04/05.
 */
public class ImageEditor {

    public void drawShape(Shape s) {
        if (s.type==1)
            drawRectangle(s);
        else if (s.type==2)
            drawCircle(s);
    }
    public void drawCircle(Circle r) {}
    public void drawRectangle(Rectangle r) {}
}
