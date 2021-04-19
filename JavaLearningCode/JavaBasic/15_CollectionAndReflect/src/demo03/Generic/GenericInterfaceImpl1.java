package com.itheima.demo03.Generic;

import java.util.List;

/*
    含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型
    public interface Iterator<E> {
        E next();
    }
    Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法泛型默认就是String
    public final class Scanner implements Iterator<String>{
        public String next() {}
    }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }

    @Override
    public String method0(String s) {
        System.out.println("参数的泛型与指定接口泛型相同");
        return s;
    }

    @Override
    public <I> void method1(I i) {
        System.out.println("覆盖重写没有意义，泛型需要在调用时才能被确定");
    }

    @Override
    public void merhod2(List<?> i) {
        System.out.println("使用通配符，泛型调用时确定");
    }
}
