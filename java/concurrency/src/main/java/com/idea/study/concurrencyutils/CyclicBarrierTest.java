package com.idea.study.concurrencyutils;

import java.util.concurrent.CyclicBarrier;

/**
 * @author andaicheng
 * @date 2016/6/30
 */
public class CyclicBarrierTest {

    static CyclicBarrier barrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(1);
            }
        }).start();

        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }
}
