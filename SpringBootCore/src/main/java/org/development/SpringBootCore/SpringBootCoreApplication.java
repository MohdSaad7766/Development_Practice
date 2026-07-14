package org.development.SpringBootCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);

//		PaymentService paymentService = context.getBean(PaymentService.class);
//		paymentService.getPaymentProperties();
	}

}
