package com.idea.study.concurrencyutils;

import java.util.concurrent.CyclicBarrier;

/**
 * @author andaicheng
 * @date 2016/6/30
 */
public class CyclicBarrierTest2 {

    static CyclicBarrier barrier = new CyclicBarrier(2, new R());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(0);
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

    static class R implements Runnable {
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
