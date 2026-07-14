package org.development;

public class PaymentService {
    private String paymentType;
    private int retryCount;

    PaymentService(String paymentType, int retryCount){
        this.paymentType = paymentType;
        this.retryCount = retryCount;

        System.out.println("PaymentService() called");
    }
    public void pay(){
        System.out.println("Payment done via "+this.paymentType+" and retryCount is "+this.retryCount+".");
    }
}
