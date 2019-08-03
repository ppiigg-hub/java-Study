package com.itheima01;
/*
比较两个数组是否相等
提示：数组内容相同，指的是元素个数相同，元素值相同，并且元素顺序相同，条件缺一不可。
        操作步骤：
        1:定义两个数组，分别使用静态初始化完成数组元素的初始化。
    ​   2:定义一个方法，用于比较两个数组的内容是否相同。
    ​   3:比较两个数组的内容是否相同，按照下面的步骤实现就可以了。
    ​   3.1.首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false。
    ​   3.2.其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false。
    ​   3.3.最后循环遍历结束后，返回true。
    ​   4:调用方法，用变量接收。
    ​   5:输出结果。
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] brr = {11,22,33,44,55};
        boolean flag = compare(arr,brr);
        System.out.println(flag);


    }
    public static boolean compare(int[] arr,int[] brr) {
        if (arr == null || brr == null) {
            return false;
        }
        if (arr.length != brr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                return false;
            }


        }  return true;
    }
}
