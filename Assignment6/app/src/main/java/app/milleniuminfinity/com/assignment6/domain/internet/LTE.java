package app.milleniuminfinity.com.assignment6.domain.internet;

/**
 * Write a description of class LTE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LTE extends Mobile
{
    @Override
    public String handleRequest(int request)
    {
        if(request == 4)
        {
            return "LTE";
        }
        else
        {
            if(nextInternetType != null)
            {
                return nextInternetType.handleRequest(request);
            }
            
            return "Invalid option";
        }
    }
}
