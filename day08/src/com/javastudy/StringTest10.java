package com.javastudy;

import java.util.Random;
import java.util.Scanner;

/*
    1.定义用户名变量：String username = "admin";
	2.定义密码变量：String password = "123";
	3.准备一个包含大写字母、小写字母、数字的数组
	4.随机从数组中获取四个字符作为验证码
	5.通过键盘录入用户名和密码和验证码
		如果全部相同(验证码不区分大小写)，提示：登录成功
		如果不同，提示：登录失败
 */
public class StringTest10 {
    public static void main(String[] args) {
        //定义用户名变量：String username = "admin";
        String username = "admin";
        //定义密码变量：String password = "123";
        String password = "123";
        //准备一个包含大写字母、小写字母、数字的数组
        char[] arr = new char[62];
        int index = 0;
        for(char c = 'A'; c <= 'Z'; c++) {
            arr[index] = c;
            index++;
        }

        for(char c = 'a'; c <= 'z'; c++) {
            arr[index] = c;
            index++;
        }

        for(char c = '0'; c <= '9'; c++) {
            arr[index] = c;
            index++;
        }
        //随机从数组中获取四个字符作为验证码
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int i = 1;i<=4;i++){
            int num = r.nextInt(arr.length);
            sb.append(arr[num]);

        }
        String verifyCode = sb.toString();
        /*通过键盘录入用户名和密码和验证码
        如果全部相同(验证码不区分大小写)，提示：登录成功
        如果不同，提示：登录失败
                */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String passwd = sc.nextLine();
        System.out.println("请输入验证码：" + verifyCode);
        String code = sc.nextLine();
        //判断用户名、密码、验证码是否相同
        if(username.equals(name) && password.equals(passwd) && verifyCode.equalsIgnoreCase(code)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
