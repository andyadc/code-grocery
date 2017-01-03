package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread06_2 extends Thread {
    private ThreadDomain06 td;
    public MyThread06_2(ThreadDomain06 td){
        this.td = td;
    }

    @Override
    public void run() {
        td.methodB();
    }
}
