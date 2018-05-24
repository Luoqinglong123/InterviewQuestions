package com.lql.兰姆达;

public class Test1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("jdk1.7");
            }
        }).start();

        new Thread(()->{
            System.out.println("兰姆达表达式");
        }).start();
    }
}
