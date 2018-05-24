package com.lql.排序.Comparable;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListTest {
    //LinkedList的排序
    public static void main(String[] args) {
        LinkedList<User> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new User("LinkedList_name" + i, "LinkedList_password" + (50 - i)));
        }
        //使用sort方法排序
       Collections.sort(list);
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}