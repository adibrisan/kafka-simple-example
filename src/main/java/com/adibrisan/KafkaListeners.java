package com.adibrisan;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "adibrisan", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "+data);
    }
}
