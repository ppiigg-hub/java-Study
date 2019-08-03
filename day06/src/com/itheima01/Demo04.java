package com.itheima01;
/*
    有十元，只能换一元和五角，有几种组合
 */
public class Demo04 {
    public static void main(String[] args) {
             int j;
        for(int i=0;i<=10;i++){
             j = 2*(10-i);

                System.out.println("一元有"+i+"个" + " " + "五角有"+j+"个");

            }
        }

    }

