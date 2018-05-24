package com.lql.排序.面试题;

import java.util.*;

/**F
 * 将HashMap中的值按照stundet的年龄倒序排序
 */

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1,new Student("张三",18));
        map.put(3,new Student("李四",20));
        map.put(2,new Student("王五",16));
        System.out.println("排序前：");
        System.out.println(map);
        System.out.println("排序后：");
        HashMap<Integer, Student> res = sortHashMap(map);
        System.out.println(res);


    }

    private static HashMap<Integer,Student> sortHashMap(HashMap<Integer, Student> map) {
        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        List<Map.Entry<Integer, Student>> list = new ArrayList<>(entries);
        Collections.sort(list,new Comparator<Map.Entry<Integer, Student>>() {


            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return -(o1.getValue().getAge()-o2.getValue().getAge());
            }
        });

        LinkedHashMap<Integer, Student> res = new LinkedHashMap<>();
        for (Map.Entry<Integer, Student> entry:list){
            res.put(entry.getKey(),entry.getValue());
        }
        //hashMap只是根据key来排序
       /* HashMap<Integer, Student> res = new HashMap<>();
        for (Map.Entry<Integer, Student> entry:list){
            res.put(entry.getKey(),entry.getValue());
        }*/
        return res;
    }
}
