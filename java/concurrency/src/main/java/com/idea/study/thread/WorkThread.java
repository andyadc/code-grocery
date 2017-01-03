package com.idea.study.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class WorkThread extends Thread {
    private CountDownLatch latch;
    private int sleepSecond;

    public WorkThread(String name, CountDownLatch latch, int sleepSecond) {
        super(name);
        this.latch = latch;
        this.sleepSecond = sleepSecond;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + "启动了,时间是: " + System.currentTimeMillis());
            Thread.sleep(sleepSecond * 1000);
            latch.countDown();
            System.out.println(this.getName() + "执行完了,时间是: " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
