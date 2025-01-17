package org.example.Service;

import org.example.Entity.Order;
import org.example.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
    void addOrder(Order order);
    Order findById(Long id);
    void save(Order order);
    List<Order> findAll();
    OrderDTO updateOrder(Long id, OrderDTO orderDTO);
}
