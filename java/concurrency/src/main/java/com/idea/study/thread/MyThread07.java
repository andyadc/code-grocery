package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread07 extends Thread {
    @Override
    public void run() {
        ThreadDomain07 td = new ThreadDomain07();
        td.print1();
    }
}
