package com.idea.study.concurrencyutils;

import java.util.concurrent.CyclicBarrier;

/**
 * @author andaicheng
 * @date 2016/6/30
 */
public class CyclicBarrierTest3 {

    static CyclicBarrier barrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread.interrupt();
        try {
            barrier.await();
        } catch (Exception e) {
            System.out.println(barrier.isBroken());
        }
    }
}
