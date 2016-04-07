package com.chad.app;

/**
 * Created by student on 2016/04/07.
 */
public class Email implements IEmail, IContent {

    private String sName;
    private String  rName;
    private IContent details;

    @Override
    public void setSender(String sender)
    {
        sName = sender;
    }
    @Override
    public void setReceiver(String receiver)
    {
        rName = receiver;
    }

    @Override
    public void setContent(IContent content)
    {
        details = content;
    }

    public String displaySender()
    {
        return sName;
    }

    @Override
    public String returnAsString()//used for serialization
    {
        return "\nThis email contains certain serialized content for : " + displaySender() + rName;
    }
}