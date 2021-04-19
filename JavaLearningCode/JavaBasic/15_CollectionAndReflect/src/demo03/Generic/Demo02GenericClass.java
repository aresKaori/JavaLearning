package com.itheima.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("可以是任意的数据类型");
        Object obj = gc.getName();

        //创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);

        System.out.println("==============================================");
        //含有泛型的方法，泛型与所在类泛型无关
        Integer num = gc3.method(2);
        System.out.println(num);
        //参数泛型与所在类泛型相同
        gc2.method1(1);
    }
}
