package com.idea.study.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class DoneThread extends Thread {
    private CountDownLatch latch;

    public DoneThread(String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + "要等待了, 时间为: " + System.currentTimeMillis());
            latch.await();
            System.out.println(this.getName() + "等待完了, 时间为: " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
