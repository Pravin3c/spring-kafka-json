package dev.pravin.spring.kafka.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Product(

        @JsonProperty(required = true, value = "product_id")
        Integer productId,

        @JsonProperty(required = true, value="product_name")
        String name,

        @JsonProperty(required = true, value="product_description")
        String description
) {
}
