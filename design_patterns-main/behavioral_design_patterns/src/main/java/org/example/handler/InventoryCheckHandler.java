
package org.example.handler;

import org.example.Entity.Order;

import java.util.Random;

public class InventoryCheckHandler extends OrderValidationHandler {
    @Override
    public boolean validate(Order order) {
        Random random = new Random();
        if(random.nextBoolean()) {
            System.out.println("Inventory check passed.");
            return super.validate(order);
        }
        else {
            System.out.println("Inventory check failed.");
            return false;
        }
    }
}
