package com.example.agricorp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.agricorp", "com.example.agricorp.gardenManagement"})
public class AgricorpApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgricorpApplication.class, args);
    }
}
