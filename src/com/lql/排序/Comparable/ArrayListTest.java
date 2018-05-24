package com.lql.排序.Comparable;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTest {
    //对ArrayList排序必须要使用Collections.sort(list)，否则不会排序，
    //会按照添加的顺序打印出来
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new User("ArrayList_name" + i, " ArrayList_password" + (50 - i)));
        }
        Collections.sort(list);//先注释看看结果
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}