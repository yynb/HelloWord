package com.itheima.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/*
   读取配置信息
       创建 连接池对象

        并且返回 一个连接对象Jedis
 */
public class JedisUtils {

    private static JedisPoolConfig config = new JedisPoolConfig();

    private static JedisPool pool ;

    // 静态代码块读取配置信息
    static{
        ResourceBundle bundle = ResourceBundle.getBundle("rdb");
        //获取 服务器ip
        String host = bundle.getString("host");
        // 端口号
        int port = Integer.parseInt(bundle.getString("port"));
        // 最大连接数
        int maxTotal = Integer.parseInt(bundle.getString("maxTotal"));
        // 最大空闲连接
        int maxIdle = Integer.parseInt(bundle.getString("maxIdle"));
        //最小空闲连接
        int minIdle = Integer.parseInt(bundle.getString("minIdle"));

        //设置到配置信息对象中
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        config.setMaxTotal(maxTotal);

        //创建 连接池对象
        pool = new JedisPool(config,host,port);
    }
    /*
       创建方法   获取连接对象
     */
    public static Jedis getJedis(){

        return pool.getResource();
    }


}
