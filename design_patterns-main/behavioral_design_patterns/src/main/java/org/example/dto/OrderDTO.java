package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String customerName;
    private String status;
    private double totalAmount;
    private String paymentStrategy;
    private boolean paid;
}
