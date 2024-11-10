
package org.example.command;

import org.example.Entity.Order;
import org.example.Service.OrderService;
import org.example.Utils.OrderMapper;
import org.example.dto.OrderDTO;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;

public class PlaceOrderCommand implements OrderCommand {
    private final OrderDTO orderDTO;
    private final OrderService orderService;

    public PlaceOrderCommand(OrderDTO orderDTO, OrderService orderService) {
        this.orderDTO = orderDTO;
        this.orderService = orderService;
    }

    public OrderDTO execute() {
        Order order = OrderMapper.toEntity(orderDTO);
        InventoryCheckHandler inventoryCheckHandler = new InventoryCheckHandler();
        PaymentValidationHandler paymentValidationHandler = new PaymentValidationHandler();
        inventoryCheckHandler.setNext(paymentValidationHandler);
        if(inventoryCheckHandler.validate(order)) {
            orderService.save(order);
            return OrderMapper.toDTO(order);
        }
        else {
            return null;
        }
    }
}
