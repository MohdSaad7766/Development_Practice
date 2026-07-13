package org.development.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CashPaymentService implements PaymentService{

    @Override
    public void makePayment() {
        System.out.println("Payment Completed via Cash.");
    }
}
