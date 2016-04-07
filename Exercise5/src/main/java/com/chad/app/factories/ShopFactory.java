package com.chad.app.factories;

import com.chad.app.domain.Shop;

/**
 * Created by student on 2016/04/07.
 */
public interface ShopFactory {
    Shop.Builder createShop(String shopNumber, String shopName, String shopOwner, String shopPhoneNumber);

}
