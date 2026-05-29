package com.my.total_jpa_back.orders.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.total_jpa_back.common.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderMultiSearchRequest {
    @JsonProperty(value = "order_id")
    private Long orderId;
    @JsonProperty(value = "product_name")
    private String productName;
    @JsonProperty(value = "price")
    private Integer price;
    @JsonProperty(value = "status")
    private OrderStatus status;
    @JsonProperty(value = "user_name")
    private String userName;
    @JsonProperty(value = "email")
    private String email;
}
