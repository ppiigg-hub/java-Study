package day08Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名:");
        String name = sc.nextLine();
        System.out.println("请录入工人的工龄:");
        int year = sc.nextInt();
        Worker w = new Worker(name,year);
        System.out.println("姓名是："+w.getName());
        System.out.println("工龄是："+w.getYear());
    }
}
