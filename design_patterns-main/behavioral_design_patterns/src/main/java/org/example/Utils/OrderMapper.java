package org.example.Utils;

import org.example.Entity.Order;
import org.example.dto.OrderDTO;
import org.example.dto.OrderDTO2;

public class OrderMapper {

    public static OrderDTO toDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setPaid(order.isPaid());
        orderDTO.setStatus(order.getStatus());
        orderDTO.setTotalAmount(order.getTotalAmount());
        orderDTO.setCustomerName(order.getCustomerName());
        orderDTO.setPaymentStrategy(order.getPaymentStrategy());
        return orderDTO;
    }

    public static OrderDTO2 toDTO2(Order order) {
        OrderDTO2 orderDTO = new OrderDTO2();
        orderDTO.setId(order.getId());
        orderDTO.setPaid(order.isPaid());
        orderDTO.setStatus(order.getStatus());
        orderDTO.setTotalAmount(order.getTotalAmount());
        orderDTO.setCustomerName(order.getCustomerName());
        orderDTO.setPaymentStrategy(order.getPaymentStrategy());
        return orderDTO;
    }

    public static Order toEntity(OrderDTO orderDTO) {
        Order order = new Order();
        order.setPaid(orderDTO.isPaid());
        order.setStatus(orderDTO.getStatus());
        order.setTotalAmount(orderDTO.getTotalAmount());
        order.setCustomerName(orderDTO.getCustomerName());
        order.setPaymentStrategy(orderDTO.getPaymentStrategy());
        return order;
    }
}
