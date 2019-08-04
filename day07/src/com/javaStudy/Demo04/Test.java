package com.javaStudy.Demo04;
/*定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。
  行为：工作work()
 定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
     要求：

1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
3.调用成员方法,打印格式如下:
工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,
分配任务,检查员工提交上来的代码.....
工号为135基本工资为10000的程序员正在努力的写着代码......
*/
public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("张三",123,15000,6000);
        m.work();
        Coder c = new Coder("王五",135,10000);
        c.work();
    }
}
