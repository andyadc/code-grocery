package com.idea.study.concurrencyutils;

import java.util.concurrent.CountDownLatch;

/**
 * @author andaicheng
 * @date 2016/6/30
 */
public class CountDownLatchTest {

    static CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                latch.countDown();
                System.out.println(2);
                latch.countDown();
            }
        }).start();

        latch.await();
        System.out.println("3");
    }
}
