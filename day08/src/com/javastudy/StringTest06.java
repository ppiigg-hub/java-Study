package com.javastudy;

public class StringTest06 {
    public static void main(String[] args) {
            //定义一个字符串对象
            String str = "Hello";
            /*
            String->StringBuilder
            方式一：直接用StringBuilder的有参构造方法创建对象，直接传递字符串
            方式二：调用append方法来添加
             */
            StringBuilder sb = new StringBuilder(str);//创建对象时，直接在构造方法中，将字符串传递

            sb.append("java").append("Heima").append("100").append("8.8");
            sb.reverse();
            String result = sb.toString();
            System.out.println(result);

    }
}
