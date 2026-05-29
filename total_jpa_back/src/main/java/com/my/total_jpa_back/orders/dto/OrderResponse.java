package com.my.total_jpa_back.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderResponse {
    private Long orderId;
    private String productName;
    private Integer price;
    private String userName;
}
