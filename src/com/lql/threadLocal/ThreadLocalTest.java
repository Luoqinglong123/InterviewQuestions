package com.lql.threadLocal;

import java.util.Arrays;
import java.util.List;

public class ThreadLocalTest {
    static ThreadLocal<Object> tr = new ThreadLocal<>();

    public static void main(String[] args) {
        Object obj = new Object();
        tr.set(obj);
    }
}
