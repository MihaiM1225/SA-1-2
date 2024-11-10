package org.example.Controller;

import org.aspectj.weaver.ast.Or;
import org.example.Entity.Order;
import org.example.Service.OrderService;
import org.example.Utils.OrderMapper;
import org.example.command.PlaceOrderCommand;
import org.example.command.UpdateOrderCommand;
import org.example.dto.OrderDTO;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.findAll().stream().map(OrderMapper::toDTO).collect(Collectors.toList());
    }

    @PostMapping
    public OrderDTO addOrder(@RequestBody OrderDTO orderDTO) {
        return new PlaceOrderCommand(orderDTO, orderService).execute();
    }

    @PutMapping("/{id}")
    public OrderDTO updateOrder(@PathVariable String id, @RequestBody OrderDTO orderDTO) {
        return new UpdateOrderCommand(Long.parseLong(id), orderDTO, orderService).execute();
    }

}
