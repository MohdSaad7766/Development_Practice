package org.development.service;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderService {

    PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.makePayment();
        System.out.println("Order Placed.");
    }

    @PreDestroy
    public void end(){
        System.out.println("end() from OrderService");
    }
}
