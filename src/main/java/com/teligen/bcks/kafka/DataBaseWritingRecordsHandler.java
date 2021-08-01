package com.teligen.bcks.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecords;

/**
 * @author 冶鹏豪
 * @date 2021/8/1
 */
public class DataBaseWritingRecordsHandler implements ConsumerRecordsHandler<String,String>{
    @Override
    public void process(ConsumerRecords<String,String> consumerRecords) {

    }
}
