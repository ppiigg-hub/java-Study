package com.javastudy;

public class StringTest07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //调用方法
        String s = arrayToString(arr);
        //输出结果
        System.out.println("s:"+s);

    }
    //定义一个方法，用于把int数组中的做数据按照指定格式凭借成一个字符串返回
    public static String arrayToString(int[] arr){
        //在方法中用StringBuilder按照要求进行拼接并把结果转成String返回
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]);
                sb.append(", ");
            }

        }
        sb.append("]");

        String s = sb.toString();
        return s;
    }
}
