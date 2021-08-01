package com.teligen.bcks.kafka.consumer;

import com.teligen.bcks.kafka.ConsumerRecordsHandler;
import kafka.utils.ShutdownableThread;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author 冶鹏豪
 * @date 2021/7/31
 */
public class Consumer extends ShutdownableThread {
    private String topic ;
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private final KafkaConsumer<String, String> consumer;
    private ConsumerRecordsHandler handler;

    public Consumer(Properties properties) {
        super("example", false);

        consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Collections.singleton(properties.getProperty("topic")));
    }



    @Override
    public void doWork() {
        final ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(1));
        handler.process(records);
    }

}
