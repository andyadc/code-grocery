package com.idea.study.thread;

/**
 * @author andaicheng
 */
public class TwoMethodsService {

    private static final Object lock1 = new Object();

    public synchronized void method1() {
        System.out.println("I'm method1");
        try {
            Thread.sleep(10000);
            System.out.println("method1 sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void method2() {
        System.out.println("I'm method2");
        try {
            Thread.sleep(5000);
            System.out.println("method2 sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void method3() {
        synchronized (this) {
            System.out.println("I'm method3");
            try {
                Thread.sleep(3000);
                System.out.println("method3 sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void method4() {
        synchronized (lock1) {
            System.out.println("I'm method4");
            try {
                Thread.sleep(4000);
                System.out.println("method4 sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
