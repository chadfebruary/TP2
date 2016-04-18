package app.milleniuminfinity.com.assignment6.domain.internet;

/**
 * Write a description of class ADSL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ADSL extends Internet
{
    @Override
    public String handleRequest(int request)
    {
        if(request == 1)
        {
            return "ADSL";
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
