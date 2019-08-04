package com.javaStudy.Demo01;

import com.javaStudy.Demo01.phone;

public class phoneDemo {
    public static void main(String[] args) {
        //创建对象
        phone p = new phone();
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}
