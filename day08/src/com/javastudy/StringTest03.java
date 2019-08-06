package com.javastudy;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        //String str = "HelloWord@#$123";

        Scanner sc = new Scanner(System.in);
        System.out.println();
        String str = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                bigCount++;
            }else if(ch>='a'&&ch<='z'){
                smallCount++;
            }else if(ch>='0'&&ch<='9'){
                numberCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("大写字符有"+bigCount+"个");
        System.out.println("小写字符有"+smallCount+"个");
        System.out.println("数字字符有"+numberCount+"个");
        System.out.println("其他字符有"+otherCount+"个");

    }
}
