package com.lql.数组和链表;


import java.util.HashMap;
import java.util.Map;

public class 数组面试题1 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 2, 1, 5, 8, 7, 8, 77, 88, 4, 11, 11, 4, 15, 15, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr
                ) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                Integer integer = map.get(a);
                map.put(a,integer+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }
    }
}

