package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThreadDead02 extends Thread {
    private DeadLock dl;
    public MyThreadDead02(DeadLock dl) {
        this.dl = dl;
    }

    @Override
    public void run() {
        try {
            dl.rightLeft();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
