package com.javastudy;

public class StringTest04 {
    public static void main(String[] args) {
        //定义一个int 类型数组，用静态初始化完成数组元素的初始化
        int[] arr = {1,2,3};
        //调用方法，用一个变量接受结果
        String sc = arrayToString(arr);
        //输出结果
        System.out.println("sc:"+sc);
    }
    //定义一个方法，用于把i那天数组中的数据按照指定格式凭借成一个字符串返回
    public static String arrayToString(int[] arr){
        String s = "[";
        //在方法中遍历数组，按照要求进行拼接
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ", ";
            }

        }
        s += "]";
        return s;
    }
}
