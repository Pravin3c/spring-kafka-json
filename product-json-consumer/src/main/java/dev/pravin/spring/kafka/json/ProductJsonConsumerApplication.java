package dev.pravin.spring.kafka.json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductJsonConsumerApplication {
    public static void main(String[] args) {

        System.out.println("Inside Consumer Application");
        SpringApplication.run(ProductJsonConsumerApplication.class, args);
    }
}