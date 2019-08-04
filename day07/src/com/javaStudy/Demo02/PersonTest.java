package com.javaStudy.Demo02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="张三";
        p1.age=18;
        Person p2 = p1;
        p2.name="李四";
        System.out.print("p1.name="+p1.name+",p1.age="+p1.age+" ");
        System.out.print("p2.name="+p2.name+",p2.age="+p2.age+" ");
    }
}
