package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread06_1 extends Thread {
    private ThreadDomain06 td;
    public MyThread06_1(ThreadDomain06 td){
        this.td = td;
    }

    @Override
    public void run() {
        td.methodA();
    }
}
