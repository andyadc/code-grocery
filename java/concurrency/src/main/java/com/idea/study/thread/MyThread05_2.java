package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread05_2 extends Thread {
    private ThreadDomain05 td;
    public MyThread05_2(ThreadDomain05 td){
        this.td = td;
    }

    @Override
    public void run() {
        td.addNum("b");
    }
}
