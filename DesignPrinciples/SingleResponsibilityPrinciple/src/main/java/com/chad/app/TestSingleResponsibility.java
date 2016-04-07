package com.chad.app;

/**
 * Created by student on 2016/04/07.
 */
public class TestSingleResponsibility {
    public static void main (String []args)
    {
        IEmail mail = new Email();
        IContent details = new Email();

        mail.setSender("Chase");
        mail.setReceiver("Chane");

        System.out.println(details.returnAsString());
    }
}
