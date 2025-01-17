
package org.example.handler;

import lombok.Setter;
import org.example.Entity.Order;

@Setter
public abstract class OrderValidationHandler {
    protected OrderValidationHandler next;

    public boolean validate(Order order) {
        if (next != null) {
            return next.validate(order);
        }
        return true;
    }
}
