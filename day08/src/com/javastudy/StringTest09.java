package com.javastudy;

public class StringTest09 {
    public static void main(String[] args) {
        //定义数组
        String[] arr = {"abc","aba","强强打强强","我爱黑马","上海自来水来自海上"};
        //遍历数组，得到每一个字符串
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i];
        //将字符串反转  借助StringBuilder类中的reverse方法
            StringBuilder sb = new StringBuilder(s1);
            sb.reverse();
            //用反转后的字符串和原始字符串比较。equals
            if(s1.equals(sb.toString())){
                System.out.println(s1+"是对称的");
            }else{
                System.out.println(s1+"不是对称的");

            }
        }
    }
}
