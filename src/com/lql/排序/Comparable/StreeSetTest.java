package com.lql.排序.Comparable;

import java.util.TreeSet;
public class StreeSetTest {
    // TreeSet类的使用，可以对存放的数据进行排序
    public static void main(String[] args) {
        //TreeSet能够排序是因为泛型User类，已经实现了Comparable接口
        TreeSet<User> tSet = new TreeSet<User>();
        for (int i = 1; i <= 10; i++) {
            //如果泛型User类没有实现Comparable接口，add方法就报错
            tSet.add(new User("TreeSet" + i, "TreeSet" + (50 - i)));
        }
        //Collections.sort(tSet);不能使用，sort里面只能存放List类的对象
        for (User user : tSet) {
            System.out.println(user.toString());//因为重写了toString方法，所以会显示User的名字和密码
        }
    }
}