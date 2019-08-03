package com.itheima01;
  /*已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值反转(在原数组中操作，不能定义第二个数组)，反转后的数组
          arr = {50, 46, 37, 28, 19}; 并在控制台输出反转后的数组元素。
          */
            /* 1:定义一个数组，用静态初始化完成数组元素的初始化。
             2:循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引。
             3:使用第三个临时变量，完成数组中两个元素的交换。
             4:遍历数组
             */
public class Demo11 {
      public static void main(String[] args) {
          int[] arr = {19, 28, 37, 46, 50};
          reverse(arr);
          arr(arr);


      }
      public static void reverse(int[] arr){
          for(int start=0,end=arr.length-1;start<=end;start++,end--){
              int temp;

                  temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;

          }
      }
      public static void arr(int[] arr){
          System.out.print("[");
          for (int i = 0; i < arr.length; i++) {
              if(i==arr.length-1){
                  System.out.print(arr[i]);
              }else{
                  System.out.print(arr[i]+"，");
              }
          }
          System.out.print("]");
      }

}
