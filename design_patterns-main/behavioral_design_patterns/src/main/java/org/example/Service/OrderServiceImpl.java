package org.example.Service;

import org.example.Entity.Order;
import org.example.Repository.OrderRepository;
import org.example.Utils.OrderMapper;
import org.example.dto.OrderDTO;
import org.example.notification.NotificationService;
import org.example.notification.Observer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findAllById(id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        Order order = orderRepository.findAllById(id);
        order.setPaid(orderDTO.isPaid());
        order.setStatus(orderDTO.getStatus());
        order.setPaymentStrategy(orderDTO.getPaymentStrategy());
        order.setCustomerName(orderDTO.getCustomerName());
        order.setTotalAmount(orderDTO.getTotalAmount());
        orderRepository.save(order);

        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(System.out::println);
        notificationService.notifyObservers("Order has changed!");

        return OrderMapper.toDTO(order);
    }
}
