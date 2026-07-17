package org.development;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.development.config.WebConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws LifecycleException {

//        Tomcat Configuration
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);
        tomcat.getConnector();

        String contextPath = "";
        String baseDoc = new File("src/main/webapp")
                .getAbsolutePath();

        Context context = tomcat.addContext(contextPath, baseDoc);

//        Start IoC Container
        AnnotationConfigWebApplicationContext springContext =
                new AnnotationConfigWebApplicationContext();

        springContext.register(WebConfig.class);

//        Dispatcher Servlet
        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(springContext);

        Tomcat.addServlet(context, "dispatcherServlet", dispatcherServlet);

//        start tomcat
        tomcat.start();

        context.addServletMappingDecoded(
                "/", "dispatcherServlet");

        System.out.println("Tomcat Started on 8080");

//        Keep tomcat Server running
        tomcat.getServer().await();
    }
}