package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class ThreadDomain06 {

    public synchronized void methodA() {
        try {
            System.out.println("Begin methodA, threadName: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("End methodA, threadName: " + Thread.currentThread().getName() + "" +
                    ", end time = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            System.out.println("Begin methodB, threadName: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("End methodB, threadName: " + Thread.currentThread().getName() + "" +
                    ", end time = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
