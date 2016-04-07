package com.chad.app.domain;

import java.util.Date;

/**
 * Created by student on 2016/04/07.
 */
public interface Person {

    public void setName(String name);
    public void setSurname(String surname);

    public String getName();
    public String getSurname();

    public void setDateOfBirth(int date);
    public int getDateOfBirth();
}
