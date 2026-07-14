package org.development;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


//        OrderService orderService = context.getBean(OrderService.class); // if two bean of same type exists then this method will not work
//
//        OrderService orderService = (OrderService) context.getBean("orderService2");

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.placeOrder();

        UserService userService = context.getBean("userService1", UserService.class);
        System.out.println(userService.getUsers());

//        context.close();
    }
}