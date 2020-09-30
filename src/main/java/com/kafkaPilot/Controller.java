package com.kafkaPilot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class Controller {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    static final  String TOPIC = "piloto";
    ///Users/taghbr/Ambiente/springboot/KafkaGleds
    // kafka-topics.sh --bootstrap-server localhost:9092 --create --topic piloto
    //kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic piloto --from-beginning
    @GetMapping("/publish/{message}")
    public String publish_message(@PathVariable("message") String message){
        kafkaTemplate.send(TOPIC, message);
        return "Mensagem enviada/publicada no Kafka, com sucesso";
    }
}
