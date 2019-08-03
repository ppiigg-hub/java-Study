package com.itheima01;
/*
可变参数:
    数据类型...变量名
    好处：
        参数可变化
    注意事项：
        1.可变参数的后边，不能有其他参数
        2.可变参数的前边，可以有其他参数（如果一个方法中有可变参数，则可变参数必须放到最后边）

 */
public class Demo08 {
    public static void main(String[] args) {
    int sum = getSum(10,20,30,40,50);
        System.out.println(sum);
    }

    public static int getSum(int... num) {
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }
}
