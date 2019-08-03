package com.itheima01;

import java.util.Scanner;

/*已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。定义一个方法，
        完成查找该数据在数组中的索引，并在控制台输出找到的索引值。*/
public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的数字：");
        int number = sc.nextInt();
        int a = getIndex(arr,number);
        System.out.println("对应的索引是:"+a);

    }
    public static int getIndex(int[] arr,int number){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                index = i;
                break;
            }
        }
        return index;
    }

}
