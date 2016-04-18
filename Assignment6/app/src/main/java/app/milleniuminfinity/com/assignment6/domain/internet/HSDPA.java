
/**
 * Write a description of class HSDPA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HSDPA extends Mobile
{
    @Override
    public String handleRequest(int request)
    {
        if(request == 3)
        {
            return "HSDPA";
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
