package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread08 extends Thread {
    private ThreadDomain08 td;
    public MyThread08 (ThreadDomain08 td) {
        this.td = td;
    }

    @Override
    public void run() {
        td.await();
    }
}
