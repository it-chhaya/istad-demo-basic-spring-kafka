package co.istad.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventListener {

    @KafkaListener(topics = "order-created-events-topic", groupId = "${spring.application.name}")
    public void orderCreatedEvent(String message) {
        System.out.println("From kafka: " + message);
    }

}
