package com.teligen.bcks.kafka;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.TopicPartition;

import java.util.Collection;

/**
 * @author 冶鹏豪
 * @date 2021/8/1
 */
public class SaveOffsetOnRebalance implements ConsumerRebalanceListener {

    @Override
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {

    }

    @Override
    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {

    }
}
