package com.itheima.resousebundel;

import java.util.ResourceBundle;

/*
    Properties
        pp

        pp.load(new FileInputStream)

        pp.

       java.util.ResourseBundle
          可以直接读取我们配置文件信息
              getBundle("文件名前缀")
          返回该对象本事 只不过 里面装了我们配置文件上的信息

          通过该对象.getString("键") 返回值
 */
public class ResourseBundlerDemo {

    public static void main(String[] args) {
        ResourceBundle  rb = ResourceBundle.getBundle("db");

        // 获取  键对应值
        String name = rb.getString("name");

        System.out.println(name);
    }

}
