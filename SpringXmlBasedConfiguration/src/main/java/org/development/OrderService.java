package org.development;


import org.springframework.beans.factory.BeanNameAware;

public class OrderService{

    private PaymentService paymentService;

    public OrderService() {
        System.out.println("OrderService() called");
    }


    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed.");
    }
}
