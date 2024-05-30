
# Spring Kafka JSON Example

A sample spring boot project using spring-kafka and JSON as a message template.

## Using

* Java 17
* Spring Boot 3.2.5
* Confluent Kafka 7.6.1
* Confluent Schema Registry 7.6.1
* Spring Kafka 3.1.4

## Modules

1) `product-json-model`
   Module for JSON model/POJO

2) `product-json-producer`
   Sample Spring Kafka JSON Producer

3) `product-json-consumer`
   Spring Kafka JSON Consumer


## Goal

Goal of this example project is to show the kafka producer and consumer using JSON as a message template.

* `master` branch - complete code example

## Build to the project

```
./mvnw clean install
```
## Start / Stop Kafka & Zookeeper

```
docker-compose up -d
```

```
docker-compose down -v
```
## Start both producer and consumer

* Spring Boot application: `product-json-producer`

```
java -jar product-json-producer/target/product-json-producer-0.0.1-SNAPSHOT.jar
```

* Spring Boot application: `product-json-consumer`

```
java -jar product-json-consumer/target/product-json-consumer-0.0.1-SNAPSHOT.jar
```
