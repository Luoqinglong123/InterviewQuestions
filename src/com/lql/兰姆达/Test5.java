package com.lql.兰姆达;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "aedwe", "asd", "aa");
        List<String> list = stringList.stream().filter(str -> str.length() > 2).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println(list);
        String collect = stringList.stream().map(str -> str.toUpperCase()).collect(Collectors.joining(" , "));
        System.out.println(collect);
    }
}
