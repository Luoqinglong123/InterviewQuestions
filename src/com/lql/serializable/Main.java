package com.lql.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        /*其中的  D:\\objectFile.obj 表示存放序列化对象的文件*/


        //序列化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\objectFile.obj"));
        Person customer = new Person("王麻子", 24);
        out.writeObject("你好!");    //写入字面值常量
        out.writeObject(new Date());    //写入匿名Date对象
        out.writeObject(customer);    //写入customer对象
        out.close();


        //反序列化对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\objectFile.obj"));
        System.out.println("obj1 " + (String) in.readObject());    //读取字面值常量
        System.out.println("obj2 " + (Date) in.readObject());    //读取匿名Date对象
        Person obj3 = (Person) in.readObject();    //读取customer对象
        System.out.println("obj3 " + obj3);
        in.close();
    }
}
