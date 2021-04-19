package com.itheima.demo02.Set;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]

        Person one = new Person("a",1);
        Person two = new Person("a",1);
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(one==two);
        boolean equals = one.equals(two);
        System.out.println(equals);

        HashSet<Person> p = new HashSet<>();
        p.add(one);
        p.add(two);
        System.out.println(p);
    }

}
