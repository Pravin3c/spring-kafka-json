package dev.pravin.spring.kafka.json;

import dev.pravin.spring.kafka.json.producer.ProductJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import dev.pravin.spring.kafka.json.model.Product;

@SpringBootApplication
public class ProductJsonProducerApplication {

    @Autowired
    ProductJsonProducer productJsonProducer;

    public static void main(String[] args) {

        System.out.println("Inside Producer main");

        SpringApplication.run(ProductJsonProducerApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void produce() {

        System.out.println("Inside Produce method");
        productJsonProducer.produce(
                new Product(
                        1,
                        "Bread",
                        "This is a Bread Product"
                )
        );
    }
}