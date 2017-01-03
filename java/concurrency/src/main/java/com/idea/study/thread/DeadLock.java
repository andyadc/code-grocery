package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class DeadLock {

    private Object left = new Object();
    private Object right = new Object();

    public void leftRight() throws Exception {
        synchronized (left) {
            Thread.sleep(2000);
            synchronized (right) {
                System.out.println("leftRight end");
            }
        }
    }

    public void rightLeft() throws Exception {
        synchronized (right) {
            Thread.sleep(2000);
            synchronized (left) {
                System.out.println("rightLeft end");
            }
        }
    }
}
