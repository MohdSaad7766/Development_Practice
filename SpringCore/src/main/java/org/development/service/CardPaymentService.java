package org.development.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CardPaymentService   implements PaymentService /* , DisposableBean, BeanNameAware, ApplicationContextAware, InitializingBean*/ {
    public CardPaymentService(){
        System.out.println("CardPaymentService() called");
    }

//    @Override
//    public void setBeanName(String name){
//        System.out.println("Bean Name: "+name);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext){
//        System.out.println("ApplicationContext Name: "+applicationContext.getClass().getName());
//    }
//
//    @Override
//    public void afterPropertiesSet(){
//        System.out.println("afterPropertiesSet() called");
//    }



    @PostConstruct
    public void start(){
        System.out.println("start()");
    }

    @Override
    public void makePayment() {

        System.out.println("Payment Completed via Card.");
    }

    @PreDestroy
    public  void end(){
        System.out.println("end()");
    }

}
