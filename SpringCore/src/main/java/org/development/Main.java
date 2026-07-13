package org.development;

import org.development.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

//        context.close();
    }
}