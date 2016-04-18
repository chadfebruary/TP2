
/**
 * Write a description of class Fibre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibre extends Internet
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
            if(nextInternetType != null)
            {
                return nextInternetType.handleRequest(request);
            }
            
            return "Invalid option";
        }
    }
}
