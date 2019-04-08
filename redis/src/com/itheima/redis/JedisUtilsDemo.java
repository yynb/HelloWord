package com.itheima.redis;

import com.itheima.utils.JedisUtils;
import redis.clients.jedis.Jedis;

import javax.jws.soap.SOAPBinding;

public class JedisUtilsDemo {

    public static void main(String[] args) {
        //获取jedis连接对象
        Jedis jedis = JedisUtils.getJedis();

        System.out.println(jedis.get("test"));

        jedis.close();
    }
}
