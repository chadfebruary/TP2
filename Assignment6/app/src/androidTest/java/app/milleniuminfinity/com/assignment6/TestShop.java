
/**
 * Write a description of class TestShop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import org.junit.Test;
import junit.framework.Assert;

public class TestShop
{
    @Test
    public void testShopFactory() throws Exception
    {
        ShopFactory shopFactoryObject = new ShopFactory();
        Shop shopObject = shopFactoryObject.getShopInstance("123", "XYZ store", "Mr T", "021 123 1234");
        
        Assert.assertEquals(shopObject.getShopNumber(), "123");
        Assert.assertEquals(shopObject.getShopName(), "XYZ store");
        Assert.assertEquals(shopObject.getShopOwner(), "Mr T");
        Assert.assertEquals(shopObject.getShopPhoneNumber(), "021 123 1234");
    }
}
