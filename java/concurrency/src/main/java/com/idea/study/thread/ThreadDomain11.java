package com.idea.study.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class ThreadDomain11 extends ReentrantReadWriteLock {

    public void read() {
        try {
            readLock().lock();
            System.out.println(Thread.currentThread().getName() + "获得了读锁, 时间为" +
                    System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readLock().unlock();
        }
    }

    public void write() {
        try {
            writeLock().lock();
            System.out.println(Thread.currentThread().getName() + "获得了写锁, 时间为" +
                    System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock().unlock();
        }
    }
}
