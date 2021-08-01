package com.teligen.bcks.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecords;

/**
 * @author 冶鹏豪
 * @date 2021/8/1
 */
public interface ConsumerRecordsHandler<K,V> {
    /**
     * kafka 记录处理方法
     * @param consumerRecords kafka记录
     */
    void process(ConsumerRecords<K, V> consumerRecords);
}
