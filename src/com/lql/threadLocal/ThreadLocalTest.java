package com.lql.threadLocal;

public class ThreadLocalTest {
    static ThreadLocal<Object> tr = new ThreadLocal<>();

    public static void main(String[] args) {
        Object obj = new Object();
        tr.set(obj);
    }
}
