package com.lql.定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//每隔两秒和四秒调用
public class TimeTaskClass extends TimerTask {
    private static volatile int count = 0;

    @Override
    public void run() {
        count = (count + 1) % 2;
        System.out.println("Boob boom");
        new Timer().schedule(new TimeTaskClass(), 2000 + 2000 * count);
    }

    static Timer timer = new Timer();

    public static void main(String[] args) {
        timer.schedule(new TimeTaskClass(), 0);
        while (true) {
            System.out.println(new Date().getSeconds());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
