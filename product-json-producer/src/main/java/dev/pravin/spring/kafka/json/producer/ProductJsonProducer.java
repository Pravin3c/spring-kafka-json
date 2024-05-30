package dev.pravin.spring.kafka.json.producer;

import dev.pravin.spring.kafka.json.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductJsonProducer {

    static final String TOPIC_NAME = "product-data-json";

    private final KafkaTemplate<String, Product> kafkaTemplate;

    public ProductJsonProducer(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(Product product) {
        log.info("Producing Product Data: {}, {}, {} in topic {}", product.productId(),
                product.name(), product.description(), TOPIC_NAME);
        kafkaTemplate.send(TOPIC_NAME, String.valueOf(product.productId()), product);
    }
}
