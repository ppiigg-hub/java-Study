package com.itheima01;

import java.util.Scanner;
/*
    需求：输入星期数，显示今天的减肥活动
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

    思路：
        1:键盘录入一个星期数，用一个变量接收
        2:对星期数进行判断，这里用 if 语句实现
        3:在对应的语句控制中输出对应的减肥活动
 */
/*
 if (week < 1 || week > 7) {
            System.out.println("你输入的星期数有误");
        } else if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else {
            System.out.println("好好吃一顿");
        }
 */

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入星期数:");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
                default:
                    System.out.println("你输入的星期数不符合规定");
                    break;
        }
    }


}
