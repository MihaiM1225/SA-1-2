package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.payment.PaymentStrategy;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private Long id;
    private String customerName;
    private String status;
    private double totalAmount;
    private String paymentStrategy;
    private boolean paid;
}

