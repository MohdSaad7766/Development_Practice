package org.development.SpringBootCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PaymentService implements ApplicationRunner , CommandLineRunner {

    @Autowired
    private PaymentProperties paymentProperties;


    public void getPaymentProperties() {
        System.out.println(this.paymentProperties);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner.run()");
        getPaymentProperties();
    }
    
    @Override
    public void run(ApplicationArguments args){
        System.out.println("ApplicationRunner.run()");
        getPaymentProperties();
    }


}
