package com.javastudy;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        //定义两个字符串，表示账户名和i密码
        String username = "teacher";
        String password = "student";
        //键盘录入密码和账户名，用Scanner实现
        Scanner sc = new Scanner(System.in);
        //用循环实现多次输入，显示成功后，用break结束循环
        for(int i=0;i<3;i++){
            System.out.println("请输入帐户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();

            if(name.equals(username)&&pwd.equals(password)){
                System.out.println("登陆成功");

                break;

            }else{
                if((2-i)==0){
                    System.out.println("你的帐户已锁定，请联系管理员");
                }else{
                    System.out.println("密码账户名错误，请再次输入,你还有"+(2-i)+"次机会");
                }

            }
        }
    }
}
