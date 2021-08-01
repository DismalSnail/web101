package com.teligen.bcks.storage;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author 冶鹏豪
 * @date 2021/7/31
 */
public class Redis {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool();
        Jedis resource = jedisPool.getResource();
        resource.ping();
        Jedis jedis = new Jedis(new HostAndPort("localhost",6379));
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
    }
}
