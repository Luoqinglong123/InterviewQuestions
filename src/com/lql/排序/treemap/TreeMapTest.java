package com.lql.排序.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        map.put("zdef","rfgh");
        map.put("asrg","zfg");
        map.put("rgd","dfgh");
        map.put("cbf","gddf");
        for (Map.Entry<String,String> entry: map.entrySet()
             ) {
            System.out.println("key:"+entry.getKey()+",:value:"+entry.getValue());
        }
    }
}
