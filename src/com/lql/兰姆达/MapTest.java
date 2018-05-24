package com.lql.兰姆达;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(100, 200, 300, 400, 500);
       // asList.stream().map((i)->i+i*0.12).forEach(System.out::println);
        Double aDouble = asList.stream().map((i) -> i + i * 0.12).reduce((sum, i) -> sum + i).get();
        System.out.println(aDouble);
    }
}
