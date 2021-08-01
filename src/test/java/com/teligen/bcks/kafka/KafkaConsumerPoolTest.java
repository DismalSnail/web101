package com.teligen.bcks.kafka;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author 冶鹏豪
 * @date 2021/7/31
 */

public class KafkaConsumerPoolTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerPoolTest.class);
    @Autowired
    ThreadPoolTaskExecutor service;

    @Test
    public void testThreadPool() {
        service.execute(() -> logger.error(Thread.currentThread().getName()+"*****************"));
        service.execute(() -> logger.error(Thread.currentThread().getName()+"*****************"));
        service.execute(() -> logger.error(Thread.currentThread().getName()+"*****************"));
        service.execute(() -> logger.error(Thread.currentThread().getName()+"*****************"));

    }
}