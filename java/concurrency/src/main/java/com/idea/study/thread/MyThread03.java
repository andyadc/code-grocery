package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread03 extends Thread {

    static {
        System.out.println("静态块打印 " + Thread.currentThread().getName());
    }

    public MyThread03() {
        System.out.println("构造方法打印 " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run 方法打印 " + Thread.currentThread().getName());
    }
}
