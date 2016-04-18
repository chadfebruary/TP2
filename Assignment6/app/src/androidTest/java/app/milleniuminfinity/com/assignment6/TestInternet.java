
/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import org.junit.Test;
import junit.framework.Assert;

public class TestInternet
{
    @Test
    public void testInternetFactory() throws Exception
    {
        InternetFactory internetFactoryObject = new InternetFactory();
        Internet internetObject = internetFactoryObject.getInternetType("Telkom", "Faster 100", 10, 100);
    }
}
