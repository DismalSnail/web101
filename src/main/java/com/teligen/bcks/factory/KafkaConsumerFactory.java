package com.teligen.bcks.factory;

import com.teligen.bcks.kafka.ConsumerRecordsHandler;
import org.apache.kafka.clients.consumer.Consumer;

/**
 * @author 冶鹏豪
 * @date 2021/8/1
 */
public class KafkaConsumerFactory {
  private Consumer<String,String> consumer;
  private ConsumerRecordsHandler<String ,String> recordsHandler;

    public KafkaConsumerFactory(Consumer<String, String> consumer, ConsumerRecordsHandler<String, String> recordsHandler) {
        this.consumer = consumer;
        this.recordsHandler = recordsHandler;
    }
}
