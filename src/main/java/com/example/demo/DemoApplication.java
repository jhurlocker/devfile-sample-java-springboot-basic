package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Value("${var_flag}")
    private String varFlag;
    
    @RequestMapping("/")
    String home() {
        System.out.println("==== VAR FLAG ==== " + varFlag);
        System.out.println("==== ENV VAR ==== " + System.getProperty("VAR_FLAG"));
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
