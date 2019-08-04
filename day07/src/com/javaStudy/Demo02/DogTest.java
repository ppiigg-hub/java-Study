package com.javaStudy.Demo02;

public class DogTest {
    public static void main(String[] args) {
        //创建狗对象
        Dog d = new Dog();
        d.name = "二哈";
        d.age = 3;
        d.color = "彩虹色";
        System.out.println("狗的名字是"+d.name);
        System.out.println("狗的年龄是"+d.age);
        System.out.println("狗的颜色是"+d.color);

        d.eat();
        d.sleep();
        d.lookhome();
    }
}
