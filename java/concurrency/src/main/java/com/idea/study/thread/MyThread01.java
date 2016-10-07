package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i ++) {
            System.out.println(Thread.currentThread().getName() + "在运行->" + i + Thread.currentThread().isAlive());
        }
    }
}
