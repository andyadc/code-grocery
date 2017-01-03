package com.idea.study.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author andaicheng
 * @date 2016/7/7
 */
public class Test002 {

    private ReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        final Test002 test = new Test002();

        new Thread() {
            @Override
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();
    }

    public void get(Thread thread) {
        rwl.readLock().lock();
        try {
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName() + "正在进行读操作.");
            }
            System.out.println(thread.getName() + "读操作完毕.");
        } finally {
            rwl.readLock().unlock();
        }
    }
}
