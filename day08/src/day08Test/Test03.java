package day08Test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {


            Scanner s = new Scanner(System.in);
            while (true) { // 不清楚输入多少次，定义死循环，输入正确时跳出即可。
                String code = getRandomCode();
                System.out.println("生成的验证码为：" + code);
                System.out.println("请输入验证码");
                String line = sc.nextLine();
                // 不区分大小写比较是否相等
                if (code.equalsIgnoreCase(line)) {
                    System.out.println("输入正确");
                    break ; // 跳出循环，结束程序
                } else {
                    System.out.println("输入错误，请重新输入...");
                }
            }break;
        }
    }
    public static String getRandomCode() {
        // 准备数据，将可选择的字符都放入StringBuilder中
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            sb.append(ch);
        }
        // 随机获取四位
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            // 字符串中的字符有索引，随机获取一个索引即相当于随机获取到了该索引的字符
            int index = r.nextInt(sb.length()); // 从索引0（包含）到字符串的长度（不包含）
            code += sb.charAt(index); // 获取该索引上的字符
        }
        // 返回结果
        return code;
    }
}
