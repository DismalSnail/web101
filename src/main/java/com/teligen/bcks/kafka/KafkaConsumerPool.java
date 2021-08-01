package com.teligen.bcks.kafka;

import com.teligen.bcks.utils.SpringContextUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author 冶鹏豪
 * @date 2021/7/30
 */
public class KafkaConsumerPool {
    private static final ThreadPoolTaskExecutor SERVICE = ((ThreadPoolTaskExecutor) SpringContextUtils
            .getContext()
            .getBean("kafkaConsumerThreadPool"));

    public static void runConsumer(Runnable command) {
        SERVICE.execute(command);
    }
}
