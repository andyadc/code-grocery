package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThreadDead01 extends Thread {
    private DeadLock dl;
    public MyThreadDead01(DeadLock dl){
        this.dl = dl;
    }

    @Override
    public void run() {
        try {
            dl.leftRight();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
