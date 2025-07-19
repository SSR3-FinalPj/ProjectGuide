package com.skshieldus.demo1.controller;

import com.skshieldus.demo1.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    KafkaProducer kafkaProducer;

    @Value("${data.test}")
    String test;

    @GetMapping("/hello")
    public String hello() {
        logger.info("hello called");
        return "Test, " + test + "!";
    }

    @PostMapping("/kafkasend")
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        logger.info("Message sent to Kafka: " + message);
        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

    


}
