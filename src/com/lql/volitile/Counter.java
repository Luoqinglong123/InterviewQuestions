package com.lql.volitile;

public class Counter {

    public volatile  static int count = 0;

    public static void inc() { 

        //这里延迟1毫秒，使得结果明显 
        try { 
            Thread.sleep(1); 
        } catch (InterruptedException e) { 
        } 

        count++; 
    } 

    public static void main(String[] args) { 

       /* //同时启动1000个线程，去进行i++计算，看看实际结果

        for (int i = 0; i < 1000; i++) { 
            new Thread(new Runnable() { 
                @Override
                public void run() { 
                    Counter.inc(); 
                } 
            }).start(); 
        } 

        //这里每次运行的值都有可能不同,可能为1000 
        System.out.println("运行结果:Counter.count=" + Counter.count); */
        Person person = new Person();
        person.age=20;
        person.name="aa";
        Person p2 = person;
        System.out.println(p2==person);
        person.age=10;
        person.name="bb";
        System.out.println(p2.name);
    } 
}