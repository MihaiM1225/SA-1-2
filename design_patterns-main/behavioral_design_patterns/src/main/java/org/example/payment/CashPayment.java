package org.example.payment;

public class CashPayment implements  PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card.");
    }
}
