package com.javastudy;

public class StringTest02 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //int length 获取字符串长度
        int l = str.length();
        System.out.println(l);
        //char 变量名（ch ) = str.charAt(int index)  获取指定索引上的字符
        char chr = str.charAt(5);
        System.out.println(chr);
        System.out.println("-------------");

        //遍历字符串通用格式
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
