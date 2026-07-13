package org.development;

import org.development.service.CardPaymentService;
import org.development.service.PaymentService;
import org.development.service.UpiPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.development")
public class AppConfig {

//    @Bean(initMethod = "start", destroyMethod = "end")
//    @Primary
//    public CardPaymentService createCardPaymentService(){
//        return new CardPaymentService();
//    }

}
