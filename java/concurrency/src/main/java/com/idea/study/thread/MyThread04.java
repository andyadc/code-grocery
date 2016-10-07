package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread04 extends Thread {
    @Override
    public void run() {
        long l1 = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 100000; i++) {
            Thread.yield();
            count = count + i + 1;
        }
        System.out.println((System.currentTimeMillis() - l1) + " ms");
    }
}
