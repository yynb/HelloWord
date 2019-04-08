package com.itheima.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/*
    redis 的连接池 操作 redis
       连接池的目的  将来  获取 连接对象找连接池就可以~

       连接池配置对象叫做 JedisPoolConfig()
       连接池对象 JedisPool
       设置 里面配置参数

 */
public class JedisPoolDemo {

    public static void main(String[] args) {
        //创建连接池配置对象 并完成配置信息操作
        JedisPoolConfig  poolconfig = new JedisPoolConfig();
        // 最多 有多少50个连接对象
        poolconfig.setMaxTotal(50);
        //最大空闲
        poolconfig.setMaxIdle(30);

        // 最少空闲
        poolconfig.setMinIdle(10);

        JedisPool jedisPool = new JedisPool(poolconfig,"localhost",6379);

        // 获取jedis 去 连接池中获取
        Jedis jedis = jedisPool.getResource();

        System.out.println(jedis.get("test"));

        // 将连接对象归还给 连接池
        jedis.close();

        // 池子也可关闭
        jedisPool.close();
    }
}
