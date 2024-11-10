
package org.example.handler;

import org.example.Entity.Order;

import java.util.Objects;

public class PaymentValidationHandler extends OrderValidationHandler {
    @Override
    public boolean validate(Order order) {
        if(Objects.equals(order.getPaymentStrategy(), "Credit Card")) {
            if(order.isPaid()) {
                System.out.println("Payment validation passed.");
                return super.validate(order);
            }
            else {
                System.out.println("Payment validation not passed.");
            }
        }
        else if(Objects.equals(order.getPaymentStrategy(), "Cash")) {
            System.out.println("Payment validation passed.");
            return super.validate(order);
        }
        return false;
    }
}
