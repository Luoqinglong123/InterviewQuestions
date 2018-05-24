package com.lql.排序.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    /**  
     * comparator的使用    
     * */  
    public static void main(String[] args) {  
       ArrayList<Student> list = new ArrayList<>();
       list.add(new Student("1wenzhi", 18));  
       list.add(new Student("3wenzhi", 19));  
       list.add(new Student("2wenzhi", 33));  
       list.add(new Student("66wenzhi", 10));  
       list.add(new Student("4wenzhi", 18));  
       System.out.println("=========排序前=======");  
       for (Student student : list) {  
           System.out.println(student);  
       }  
   
        // 按照年龄升序排列  
       Collections.sort(list, new USerAgeSort());
       System.out.println("=========排序后=======");  
   
       for (Student student : list) {  
           System.out.println(student);  
       }  
    }  
}  