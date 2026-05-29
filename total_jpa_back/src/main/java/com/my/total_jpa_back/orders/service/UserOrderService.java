package com.my.total_jpa_back.orders.service;

import com.my.total_jpa_back.common.entity.OrderStatus;
import com.my.total_jpa_back.orders.dto.OrderMultiSearchRequest;
import com.my.total_jpa_back.orders.dto.OrderMultiSearchResponse;
import com.my.total_jpa_back.orders.dto.OrderResponse;
import com.my.total_jpa_back.orders.repository.UserOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserOrderService {
    private final UserOrderRepository userOrderRepository;
    private final OrderMultiSearchRequest orderMultiSearchRequest;
    private final OrderMultiSearchResponse orderMultiSearchResponse;

    public List<OrderResponse> findByStatus(OrderStatus status) {
        return userOrderRepository.findOrderStatusResponse(status);
    }

    public List<OrderMultiSearchResponse> multiSearch(OrderStatus status, Integer price, String keyword) {
        return userOrderRepository.searchOrders(status, price, keyword);
    }
}
