
package org.example.handler;

import org.example.Entity.Order;

public abstract class OrderValidationHandler {
    protected OrderValidationHandler next;

    public void setNext(OrderValidationHandler next) {
        this.next = next;
    }

    public boolean validate(Order order) {
        if (next != null) {
            return next.validate(order);
        }
        return true;
    }
}
