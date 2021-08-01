package com.teligen.bcks.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.Random;

/**
 * @author 冶鹏豪
 * @date 2021/7/31
 */
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private   KafkaProducer<String,String> producer;
    private static final Random random = new Random();
    public Producer(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers","192.168.137.100:9092,192.168.137.101:9092,192.168.137.103:9092");
        properties.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<>(properties);

    }
    public KafkaProducer<String,String> getProducer(){
        return producer;
    }

}
