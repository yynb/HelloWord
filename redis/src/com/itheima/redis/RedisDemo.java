package com.itheima.redis;

import redis.clients.jedis.Jedis;

/*
     java 连接数据库 redis

       实现 java程序 对数据库的 存取

       mysql数据库  需要获取连接对象  Connection

       redis数据库  需要连接对象   Jedis

       实现步骤
         1：创建 Jedis对象
             构造中传入  服务器ip+端口号
         2： 调用设置方法
             方法名和 命令名 一致

         3：释放资源

 */
public class RedisDemo {

    public static void main(String[] args) {
        //创建连接对象
        Jedis jedis = new Jedis("localhost",6379);
        //  执行操作
//        jedis.set("test","凤姐");
        System.out.println(jedis.get("test"));
        // 关闭连接
        jedis.close();
    }
}
