package com.kaminocode.ecommerce.dto;

import com.kaminocode.ecommerce.entity.Address;
import com.kaminocode.ecommerce.entity.Customer;
import com.kaminocode.ecommerce.entity.Order;
import com.kaminocode.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
