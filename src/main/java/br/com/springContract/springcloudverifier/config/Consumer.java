package br.com.springContract.springcloudverifier.config;

import org.springframework.stereotype.Component;

@Component
class Consumer {

//    @KafkaListener(topics = "${cloudkarafka.topic}")
//    public void processMessage(String message,
//                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
//                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
//                               @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
//        System.out.printf("Mensagem consumida do tópico %s-%d[%d] \"%s\"\n", topics.get(0), partitions.get(0), offsets.get(0), message);
//    }

}
