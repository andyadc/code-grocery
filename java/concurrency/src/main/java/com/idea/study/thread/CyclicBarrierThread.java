package com.idea.study.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author andaicheng
 * @date 2016/6/21
 */
public class CyclicBarrierThread extends Thread {
    private CyclicBarrier cyclicBarrier;
    private int sleepSecond;

    public CyclicBarrierThread(CyclicBarrier cyclicBarrier, int sleepSecond) {
        this.cyclicBarrier = cyclicBarrier;
        this.sleepSecond = sleepSecond;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + "运行了.");
            Thread.sleep(sleepSecond * 1000);
            System.out.println(this.getName() + "准备等待了, 时间为" + System.currentTimeMillis());
            cyclicBarrier.await();
            System.out.println(this.getName() + "结束等待了, 时间为" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
