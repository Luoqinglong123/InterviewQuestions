package com.lql.定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends TimerTask {
    private static volatile int count = 0;

    @Override
    public void run() {
        count = (count + 1) % 2;
        System.out.println("执行一次");
        new Timer().schedule(new MyTimer(), 2000 + 2000 * count);
    }

    public static void main(String[] args) throws InterruptedException {
        new Timer().schedule(new MyTimer(), 0);
        while (true) {
            Thread.sleep(1000);
            System.out.println("当前第" + new Date().getSeconds() + "秒");
        }

    }
}
