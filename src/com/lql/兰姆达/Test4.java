package com.lql.兰姆达;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        System.out.println("all are " + names);

        filter(names, (str) -> str.equals("Java"));
    }

    /*  public static void filter(List<String> names, Predicate condition){
          for (String name: names
                  ) {
              if(condition.test(name)){
                  System.out.println(name+" ");
              }
          }
      }*/
    public static void filter(List<String> names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " 1111");
        });
    }

}
