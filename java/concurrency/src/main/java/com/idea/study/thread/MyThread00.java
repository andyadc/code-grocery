package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThread00 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i ++) {
            /*try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(this.getName() + "在运行->" + i + this.isAlive());
        }
    }
}
