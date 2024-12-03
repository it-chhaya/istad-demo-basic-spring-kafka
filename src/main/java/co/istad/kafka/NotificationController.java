package co.istad.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    void sendNotification() {
        kafkaTemplate.send("order-created-events-topic", "message","Welcome to my channel");
    }

}
