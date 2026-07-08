package com.practice.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    private String sayHello(){
        System.out.println("sayHello() called.");
        return "Hello Saad.";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    @ResponseBody
    private String sayBye(){
        System.out.println("sayBye() called.");
        return "<h1>Bye Saad.</h1>";
    }
}
