package com.itheima.demo03.Generic;

import java.util.ArrayList;

/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();

        gi1.method("字符串");
        gi1.method0("abc");//参数的泛型与类泛型相同

        gi1.method1("abc");//带泛型的方法,调用传参时确定泛型类型
        gi1.method1(1);//带泛型的方法,调用传参时确定泛型类型

        ArrayList<Integer> list = new ArrayList<>();
        gi1.merhod2(list);//使用通配符，泛型调用时确定

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);
        gi2.method0(1);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);
        gi3.method0(2.1);

        gi2.method1("abc");//带泛型的方法,调用传参时确定泛型类型
        gi2.method1(2.2);//带泛型的方法,调用传参时确定泛型类型

        ArrayList<String> list1 = new ArrayList<>();
        gi2.merhod2(list1);//使用通配符，泛型调用时确定
    }
}
