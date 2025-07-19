package com.skshieldus.demo1.kafka;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    Logger logger = LoggerFactory.getLogger(getClass());

    @KafkaListener(topics = "${spring.kafka.template.default-topic}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(String message) {
        // Process the received message
        logger.info("Received message: " + message);
    }
}
