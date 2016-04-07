package com.chad.app;

import com.chad.app.domain.Shop;
import com.chad.app.factories.ShopFactory;
import com.chad.app.factories.ShopFactoryImpl;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class ShopFactoryTest {

    private ShopFactory factory;

    @Test
    public void setup() throws Exception {
        factory = ShopFactoryImpl.getInstance();
    }

    @Test
    public void testShopCreation() throws Exception {
        Shop shop = factory.createShop("1", "A", "B", "021");

        Assert.assertEquals(shop.getShopNumber(), "1");
        Assert.assertEquals(shop.getShopName(), "A");
        Assert.assertEquals(shop.getShopOwner(), "B");
        Assert.assertEquals(shop.getShopPhoneNumber(), "021");
    }
}
