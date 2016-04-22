package app.milleniuminfinity.com.assignment6.factories.shop;

import app.milleniuminfinity.com.assignment6.domain.shop.Shop;

/**
 * Created by Admin on 2016/04/15.
 */
public class ShopFactory {
    
    public static Shop getShopInstance(String shopNumber,String shopName,String shopOwner,String shopPhoneNumber)
    {
        Shop shop = new Shop.Builder()
                        .shopNumber(shopNumber)
                        .shopName(shopName)
                        .shopOwner(shopOwner)
                        .shopPhoneNumber(shopPhoneNumber)
                        .build();
    
        return shop;
    }
}
