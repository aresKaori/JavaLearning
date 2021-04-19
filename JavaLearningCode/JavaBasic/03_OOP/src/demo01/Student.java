package cn.itcast.day06.demo01;

/*
定义一个类，用来模拟“学生”事物。其中就有两个组成部分：

属性（是什么）：
    姓名
    年龄
行为（能做什么）：
    吃饭
    睡觉
    学习

对应到Java的类当中：

成员变量（属性）：
    String name; // 姓名
    int age; // 年龄
成员方法（行为）：
    public void eat() {} // 吃饭//普通方法：public static;成员方法：无static关键字
    public void sleep() {} // 睡觉//参数、返回值可有可无
    public void study() {} // 学习

定义类的注意事项：
1. 成员变量是直接定义在类当中的，在方法外边。//此前变量定义在方法内部(如main方法)，属于局部变量。
2. 成员方法不要写static关键字。
 */
public class Student {

    // 成员变量
    String name; // 姓名
    int age; // 年龄

    // 成员方法
    public void eat() {
        System.out.println("吃饭饭！");
    }

    public void sleep() {
        System.out.println("睡觉觉！");
    }

    public void study() {
        System.out.println("学习！");
    }

}
