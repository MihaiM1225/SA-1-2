package org.example.Repository;

import org.example.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findAllById(Long id);
    List<Order> findAll();
}
