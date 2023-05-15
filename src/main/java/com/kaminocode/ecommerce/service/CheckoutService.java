package com.kaminocode.ecommerce.service;

import com.kaminocode.ecommerce.dto.Purchase;
import com.kaminocode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
