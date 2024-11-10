package org.example.command;

import org.example.Service.OrderService;
import org.example.dto.OrderDTO;

public class UpdateOrderCommand implements OrderCommand {

    private final Long id;
    private final OrderDTO orderDTO;
    private final OrderService orderService;

    public UpdateOrderCommand(Long id, OrderDTO orderDTO, OrderService orderService) {
        this.id = id;
        this.orderDTO = orderDTO;
        this.orderService = orderService;
    }

    public OrderDTO execute() {
        return orderService.updateOrder(id, orderDTO);
    }
}
