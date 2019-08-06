package com.javastudy;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //调用方法，用一个变量接收结果
        String s = reverse(line);
        //输出结果
        System.out.println("s:"+s);

    }
    //定义一个方法，实现字符串反转
    public static String reverse(String s){
        //在方法中对字符串倒序遍历
        String ss = "";
        for (int i = s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
