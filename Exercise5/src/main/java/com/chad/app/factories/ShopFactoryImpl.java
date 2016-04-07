package com.chad.app.factories;

import com.chad.app.domain.Shop;

/**
 * Created by student on 2016/04/07.
 */
public class ShopFactoryImpl implements ShopFactory{

    private static ShopFactoryImpl factory = null;

    public static ShopFactoryImpl getInstance()
    {
        if(factory == null)
            factory = new ShopFactoryImpl();
        return factory;
    }

    @Override
    public Shop.Builder createShop(String shopNumber, String shopName, String shopOwner, String shopPhoneNumber)
    {
        Shop shop = new Shop.Builder()
                .shopNumber(shopNumber)
                .shopName(shopName)
                .shopOwner(shopOwner)
                .shopPhoneNumber(shopPhoneNumber);

        return shop;
    }
}
