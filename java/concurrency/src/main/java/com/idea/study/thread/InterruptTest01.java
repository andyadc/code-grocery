package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/7/7
 */
public class InterruptTest01 {
    public static void main(String[] args) throws InterruptedException {
        InterruptTest01 test = new InterruptTest01();
        Thread thread = test.new MyThread();

        thread.start();
        Thread.currentThread().sleep(2000);
        thread.interrupt();
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 10000000 && !isInterrupted()) {
                System.out.println(i + " while循环.");
                i ++;
            }
        }
    }
}
