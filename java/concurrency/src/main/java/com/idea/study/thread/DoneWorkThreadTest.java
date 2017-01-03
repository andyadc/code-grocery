package com.idea.study.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class DoneWorkThreadTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        DoneThread doneThread1 = new DoneThread("DoneThread1", latch);
        DoneThread doneThread2 = new DoneThread("DoneThread2", latch);

        doneThread1.start();
        doneThread2.start();

        WorkThread workThread1 = new WorkThread("WorkThread1", latch, 2);
        WorkThread workThread2 = new WorkThread("WorkThread2", latch, 3);
        WorkThread workThread3 = new WorkThread("WorkThread3", latch, 4);

        workThread1.start();
        workThread2.start();
        workThread3.start();
    }

}
