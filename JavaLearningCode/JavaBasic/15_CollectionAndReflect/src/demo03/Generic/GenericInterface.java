package com.itheima.demo03.Generic;

import java.util.List;

/*
    定义含有泛型的接口
 */
public interface GenericInterface<I> {
    public abstract void method(I i);

    default I method0(I i){
        System.out.println("参数为泛型的默认方法");
        return i;
    }

    default <I> void method1(I i){
        System.out.println("泛型默认方法");
    }

    default void merhod2(List<?> i) {
        System.out.println("使用泛型通配符");
    }
}
