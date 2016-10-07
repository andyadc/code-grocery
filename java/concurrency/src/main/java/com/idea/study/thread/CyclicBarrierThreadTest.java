package com.idea.study.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author andaicheng
 * @date 2016/6/21
 */
public class CyclicBarrierThreadTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("CyclicBarrier的所有线程await()结束了，我运行了, 时间为" + System.currentTimeMillis());
            }
        };
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, runnable);
        CyclicBarrierThread thread1 = new CyclicBarrierThread(cyclicBarrier, 3);
        CyclicBarrierThread thread2 = new CyclicBarrierThread(cyclicBarrier, 6);
        CyclicBarrierThread thread3 = new CyclicBarrierThread(cyclicBarrier, 9);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
