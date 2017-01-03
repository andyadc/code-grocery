package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class ThreadDomain07 {
    public synchronized void print1() {
        System.out.println("ThreadDomain07 print1");
        print2();
    }

    public synchronized void print2() {
        System.out.println("ThreadDomain07 print2");
        print3();
    }

    public synchronized void print3() {
        System.out.println("ThreadDomain07 print3");
    }


}
