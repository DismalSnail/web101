package com.teligen.bcks.kafka;

import com.teligen.bcks.factory.KafkaConsumerFactory;
import com.teligen.bcks.kafka.consumer.Consumer;
import com.teligen.bcks.utils.SpringContextUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Properties;

/**
 * @author 冶鹏豪
 * @date 2021/8/1
 */
public class KafkaConsumerApplication {
    private final static ThreadPoolTaskExecutor SERVICE = (ThreadPoolTaskExecutor)SpringContextUtils.getContext().getBean("kafkaConsumerThreadPool");
    public static void main(String[] args) {
        Properties prop = new Properties();
        Consumer con = new Consumer(prop);
        SERVICE.execute(con);
    }
}
