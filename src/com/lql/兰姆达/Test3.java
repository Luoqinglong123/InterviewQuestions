package com.lql.兰姆达;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 19);
        Student student2 = new Student("张三", 15);
        Student student3 = new Student("张三", 11);
        Student student4 = new Student("张三", 29);
        Student student5 = new Student("张三", 21);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students,(o1,o2)->{
            return o1.getAge()-o2.getAge();
        });
        students.forEach(System.out::println);
    }
}
