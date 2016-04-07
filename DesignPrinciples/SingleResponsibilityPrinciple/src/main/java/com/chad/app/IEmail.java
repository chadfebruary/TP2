package com.chad.app;

/**
 * Created by student on 2016/04/07.
 */
public interface IEmail {

    public abstract void setSender(String sender);
    public abstract void setReceiver(String receiver);
    public abstract void setContent(IContent content);
}
