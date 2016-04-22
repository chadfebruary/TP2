package app.milleniuminfinity.com.assignment6.domain.internet;

/**
 * Write a description of class Fibre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibre extends Connection
{
    @Override
    public String handleRequest(int request)
    {
        if(request == 2)
        {
            return "Fibre";
        }
        else
        {
            if(nextConnectionType != null)
            {
                return nextConnectionType.handleRequest(request);
            }
            
            return "Invalid option";
        }
    }
}
