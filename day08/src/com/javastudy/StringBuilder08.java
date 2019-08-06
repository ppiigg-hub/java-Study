package com.javastudy;

import java.util.Scanner;

public class StringBuilder08 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        //调用方法，用一个变量接收结果
        String s = oneReverse(line);
        //输出结果
        System.out.println("s:"+s);

    }
    //定义一个方法，实现字符串反转。发挥值类型string，参数Strings
    public static String oneReverse(String s){
        //在方法中用StringBuilder实现字符串反转，并把结果转换为String返回
        //string --- stringBuilder---reverse()---string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;

        //return new StringBuilder(s).reverse().toString();
    }
}
